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
	Dim pass As String
	Dim truepass As String
	Dim components() As String
	Dim MyBluetooth As Bluetooth
	Dim Activity As Activity
	'Dim Input As B4XView
	Dim day As String
End Sub


Public Sub Initialize
	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("hacktues")
End Sub
'Sub InputBox(prompt As String) As String
	'Dim no As String
	'no = InputBox.InputDialog(prompt,"", "", "", "")
	'Return no
'End Sub
'Private Sub Button6_Click()
	'pass = InputBox("set password")
	'Root.LoadLayout("ENTER_PASSWORD")
'End Sub
'Private Sub Button7_Click()
	'truepass = InputBox("Enter password")
	'If truepass <> pass Then
	'	Log("incorrect password")
'Else
	'	Log("correct password")
	'	Root.LoadLayout("hacktues")
	'End If
'End Sub



'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Sub Activity_Create(FirstTime As Boolean)
	Root.LoadLayout("MainPage")
	MyBluetooth.Initialize("MyBluetooth")
End Sub

Sub ConnectToDevice
    Dim macAddress As String
    macAddress = ""
    MyBluetooth.Connect(macAddress)
End Sub

Sub ReadBluetoothData
    Dim data As String
'   	data = MyBluetooth.Read
   	Log("Received data: " & data)
	components = Regex.Split(";","Received data" & data)
End Sub
Private Sub Button1_Click()
	xui.MsgboxAsync("Received data:", "Weather" &components(0) )
End Sub
Private Sub Button2_Click()
	Root.LoadLayout("MapFragment1")
End Sub
Private Sub MapFragment1_Click
	
End Sub
'Sub SetApplicationText
	'If day = 1 Then
		'CreateResourceFromFile(Macro, FirebaseAnalytics.GooglePlayBase)
		'AddApplicationText("android:name", "com.google.android.geo.API_KEY", "android:value", "AIzaSyCcxrTpXN577ZKtKAwoBthrmiPXdLv1fDI")
		'AddApplicationText("android:name", "org.apache.http.legacy", "android:required", "false")
	'End If
'End Sub
Private Sub Button3_Click()
	xui.MsgboxAsync("Received data:", "Compas" &components(2) )
End Sub
Private Sub Button4_Click()
	xui.MsgboxAsync("Received data:", "TIME AND DATE" &components(3) )
End Sub

