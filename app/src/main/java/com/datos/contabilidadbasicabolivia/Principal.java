package com.datos.contabilidadbasicabolivia;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class Principal extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    Toolbar toolbar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        fab=findViewById(R.id.fab);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout, toolbar,R.string.Navigation_drawer_open,R.string.Navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView=findViewById(R.id.navigation_drawer);
        navigationView.setNavigationItemSelectedListener(this);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setBackground(null);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId=item.getItemId();
                if(itemId==R.id.bottom_home){
                    openFragment(new HomeFragment());
                    return true;
                } else if (itemId==R.id.bottom_short) {
                    openFragment(new ProfileFragment());
                    return true;
                }else if (itemId==R.id.bottom_subscription) {
                    openFragment(new LoveFragment());
                    return true;
                }else if (itemId==R.id.bottom_library) {
                    openFragment(new BlankFragment());
                    return true;
                }

                return false;
            }
        });
        fragmentManager=getSupportFragmentManager();
        openFragment(new HomeFragment());

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Principal.this, "Upload Videos", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Principal.this, Home_segundo.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==R.id.nav_trending){
            openFragment(new DateFragment());
        }else if(itemId==R.id.nav_music){
            openFragment(new MusicFragment());
        } else if (itemId==R.id.nav_gaming) {
            openFragment(new GamingFragment());
        } else if (itemId==R.id.nav_sugerencias) {
            openFragment(new SugerenciasFragment());
        }else if (itemId==R.id.nav_news) {
            Toast.makeText(this, "Normativa No Found", Toast.LENGTH_SHORT).show();
        }else if (itemId==R.id.nav_sports) {
            Toast.makeText(this, "PDF no Found", Toast.LENGTH_SHORT).show();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
    private void openFragment(Fragment fragment){
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}