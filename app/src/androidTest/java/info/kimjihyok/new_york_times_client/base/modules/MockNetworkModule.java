package info.kimjihyok.new_york_times_client.base.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import info.kimjihyok.new_york_times_client.data.remote.ApiController;
import info.kimjihyok.new_york_times_client.data.remote.NewYorkTimesApiInterface;

import static org.mockito.Mockito.mock;

/**
 * Created by jihyokkim on 2017. 9. 25..
 */

@Module
public class MockNetworkModule extends NetworkModule {

  @Override
  @Singleton
  @Provides
  ApiController providesApiController(NewYorkTimesApiInterface service) {
    return mock(ApiController.class);
  }
}
