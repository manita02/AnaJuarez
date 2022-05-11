import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { APlogoComponent } from './componentes/aplogo/aplogo.component';
import { RsocialesComponent } from './componentes/rsociales/rsociales.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { AcercaDeComponent } from './componentes/acerca-de/acerca-de.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardSoftSkillsComponent } from './componentes/hard-soft-skills/hard-soft-skills.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    APlogoComponent,
    RsocialesComponent,
    BannerComponent,
    AcercaDeComponent,
    EducacionComponent,
    HardSoftSkillsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
