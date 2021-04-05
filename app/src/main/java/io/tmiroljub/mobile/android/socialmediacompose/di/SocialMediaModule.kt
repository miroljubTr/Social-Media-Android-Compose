package io.tmiroljub.mobile.android.socialmediacompose.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.tmiroljub.mobile.android.socialmediacompose.data.SocialMediaRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SocialMediaModule {

    @Provides
    @Singleton
    fun provideSocialMediaRepository() = SocialMediaRepository()
}