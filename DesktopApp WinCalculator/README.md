# WebAppDriver Test Screenplay and Serenity BDD

Desktop automation of windows calculator, using screenplay and serenityBDD

## Requerements:
- Download *(stable version)* WinAppDriver : [WinAppDriver Releases](https://github.com/Microsoft/WinAppDriver/releases "WinAppDriver Releases") Download file **WindowsApplicationDriver.msi** e install, leave default route.
- Activate modo Development in Windows -> Configuration -> Search "Development Configuration" ->**Activate the Check of Development mode**
- Download the installer from SDK Windows 10: [Descargar SDK Windows 10](https://developer.microsoft.com/es-es/windows/downloads/windows-10-sdk "Download SDK Windows 10") Not download the ISO. Perform Installation, leave deafult route.

**Note:** This tool give us the Inspector for mapping the objects of the desktop application.

### Configuration
- You going to the route where installed the WinAppDriver and execute *WinAppDriver.exe* for default the route is: `C:\Program Files (x86)\Windows Application Driver`

The execution open the console with the next message:
![winappdriver](/screenshots/WinAppDriver.jpg)

> Now you can execute the automation

### Execution Command
- `gradle clean test aggregate`

### Objects Mapping
- If you want mapping one application, you going to the route: `C:\Program Files (x86)\Windows Kits\10\bin\10.0.18362.0\x64` (installation route of the SDK de windows 10) and execute in **inspect.exe**.

### Execution Result

![Reporte](/screenshots/resultexecution.jpg)

> This create sceneries more complex that have a high flow

