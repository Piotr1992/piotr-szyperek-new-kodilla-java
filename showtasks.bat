call runcrud
if "%ERRORLEVEL%" == "0" goto runbrowser
echo.
echo File runcrud.bat has errors – breaking work
goto fail

:runbrowser
start chrome "about:none"
if "%ERRORLEVEL%" == "0" goto enterwebsite
echo.
echo CHROME has errors – can't run browser
goto end

:enterwebsite
start chrome "http://localhost:8080/crud/v1/task/getTasks"
if "%ERRORLEVEL%" == "0" goto end
echo.
echo Tab has errors – can't go website
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.