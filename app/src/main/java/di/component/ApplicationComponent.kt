package di.component

import android.app.Application
import com.example.androiddagger.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import di.module.ActivityBindingModule

@Component(
    modules = [
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class
    ]
)

interface ApplicationComponent : AndroidInjector<MainApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): ApplicationComponent
    }
}