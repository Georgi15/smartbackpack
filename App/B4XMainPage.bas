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
	Root.LoadLayout("MainPage")
	MyBluetooth.Initialize("MyBluetooth")
	MyBluetooth.Listen 
End Sub
Sub MyBluetooth_Connected(Success As Boolean)
	If Success Then
		Log("Connected")
	Else
		Log("Failed to connect")
	End If
End Sub
Sub MyBluetooth_DataAvailable (Buffer() As Byte)
	Dim data As String
	data = BytesToString(Buffer, 52 , Buffer.Length, "UTF8")
	components= Regex.Split("\|","" & data)
	Log("Received data: " & data)
End Sub
Private Sub Button1_Click()
	xui.MsgboxAsync("data:", "" &data )
'	Log("Air Humidity :" & components(0))
'	Log("tempreture :" & components(1))
End Sub
Private Sub Button2_Click()
    Root.RemoveAllViews
	Root.LoadLayout("MapFragment1")
	Wait For MapFragment1_Ready
	gmap = MapFragment1.GetMap
	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
		Dim WaypointMarker As Marker
		'Dim Latitude As String
		'Dim Longtitude As String
		'Latitude = components(7)
		'Longtitude = components(8)
	WaypointMarker = gmap.AddMarker2(51.5074,-0.1278,"Current Location", "")
        'WaypointMarker = gmap.AddMarker2(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,"Current Location", "")
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
