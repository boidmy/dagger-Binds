package di.module

import com.example.androiddagger.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [
        TierModule::class,
        EngineModule::class
    ])
    abstract fun mainActivity(): MainActivity
}