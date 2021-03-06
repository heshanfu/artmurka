package com.artmurka.artmurkaapp.android.views.fragments.di

import com.artmurka.artmurkaapp.android.di.scopes.PerFragment
import com.artmurka.artmurkaapp.android.views.fragments.CategoryFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector
@PerFragment
@Subcomponent(modules = [ ])
interface CategoryFragmentComponent: AndroidInjector<CategoryFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<CategoryFragment>()

}