/*
 * Copyright 2000-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.teamcilty.github.api;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Eugene Petrenko (eugene.petrenko@gmail.com)
 * Date: 06.09.12 2:54
 */
public interface GitHubApiFactory {
  public static final String DEFAULT_URL = "https://api.github.com";

  @NotNull
  GitHubApi openGitHub(@NotNull final String url,
                       @NotNull final String username,
                       @NotNull final String password);
}
