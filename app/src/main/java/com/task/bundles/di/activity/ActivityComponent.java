package com.task.bundles.di.activity;

import com.task.bundles.ui.home.HomeActivity;

import dagger.Subcomponent;

/**
 * This interface is used by dagger to generate the code that defines the connection between the provider of objects
 * (i.e. {@link ActivityModule}), and the object which expresses a dependency.
 */

@ActivityScope
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(HomeActivity homeActivity);

}