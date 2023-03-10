B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Dim components() As String
	Dim MyBluetooth As Serial
	Private rp As RuntimePermissions
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private Activate As Activity
	Private hacktues As Panel
	Dim data As String
End Sub


Public Sub Initialize
	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("hacktues")
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Sub Activity_Create(FirstTime As Boolean)
	'hacktues = Activate.GetPanel("hacktues")
	Root.LoadLayout("MainPage")
	MyBluetooth.Initialize("MyBluetooth")
End Sub

Sub ConnectToDevice
    Dim macAddress As String
	macAddress = "E0:5A:1B:5F:08:7C"
    MyBluetooth.Connect(macAddress)
End Sub

Sub InputStreamBluetoothData
    Dim data As String
   	data = MyBluetooth.InputStream
   	Log("Received data: " & data)
	'components(0) = Regex.Split("\|","" & data)
End Sub
Private Sub Button1_Click()
	Log("data:" & data)
	'Log("Air Humidity :" & components(0))
	'Log("tempreture :" & components(1))
End Sub
Private Sub Button2_Click()
	'hacktues.Visible= False
    Root.RemoveAllViews
	Root.LoadLayout("MapFragment1")
	Wait For MapFragment1_Ready
	gmap = MapFragment1.GetMap
	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		gmap.MyLocationEnabled = True
		Dim WaypointMarker As Marker
		'WaypointMarker = gmap.AddMarker2(LastLocation.components(7), LastLocation.components(8), "Current location")
	Else
		Log("No permission!")
	End If
End Sub
Private Sub Button3_Click
	Root.RemoveAllViews
	Root.LoadLayout("hacktues")
End Sub
Private Sub Button4_Click()
	xui.MsgboxAsync("day:", "TIME AND DATE" &components(2) )
	xui.MsgboxAsync("month:", "TIME AND DATE" &components(3) )
	xui.MsgboxAsync("year:", "TIME AND DATE" &components(4) )
	xui.MsgboxAsync("hour:", "TIME AND DATE" &components(5) )
	xui.MsgboxAsync("minute:", "TIME AND DATE" &components(6) )
End Sub
