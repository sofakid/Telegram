@echo off

SET CONFIG_BAT=OK

SET JAVA_HOME=c:\Program Files\Java\jdk1.8.0_191
SET PYTHON_COMMAND=python
SET ANDROID_HOME=%LOCALAPPDATA%\Android\Sdk
SET ANDROID_NDK_HOME=C:\oldndk\android-ndk-r15c
SET ANDROID_BUILD_TOOLS=%ANDROID_HOME%\build-tools\28.0.3
SET ADB=%ANDROID_HOME%\platform-tools\adb.exe
SET TLOG=%ADB% logcat tmessages:V *:E

echo Configured environment:
echo   - JAVA_HOME=%JAVA_HOME%
echo   - PYTHON_COMMAND=%PYTHON_COMMAND%
echo   - ANDROID_HOME=%ANDROID_HOME%
echo   - ANDROID_NDK_HOME=%ANDROID_NDK_HOME%
echo   - ANDROID_BUILD_TOOLS=%ANDROID_BUILD_TOOLS%
echo   - ADB=%ADB%
echo   - TLOG=%TLOG%
