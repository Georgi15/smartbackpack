package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _activity_create(RemoteObject __ref,RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("activity_create")) { return __ref.runUserSub(false, "b4xmainpage","activity_create", __ref, _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="MyBluetooth.Initialize(\"MyBluetooth\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mybluetooth" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyBluetooth")));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 27;BA.debugLine="Root.LoadLayout(\"hacktues\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("hacktues")),__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Private Sub Button1_Click()";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="xui.MsgboxAsync(\"Received data:\", \"Weather\" &comp";
Debug.ShouldStop(32);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Received data:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Weather"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("button2_click")) { return __ref.runUserSub(false, "b4xmainpage","button2_click", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Private Sub Button2_Click()";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Root.LoadLayout(\"MapFragment1\")";
Debug.ShouldStop(256);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MapFragment1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("button3_click")) { return __ref.runUserSub(false, "b4xmainpage","button3_click", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Private Sub Button3_Click()";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="xui.MsgboxAsync(\"Received data:\", \"Compas\" &compo";
Debug.ShouldStop(536870912);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Received data:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Compas"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("button4_click")) { return __ref.runUserSub(false, "b4xmainpage","button4_click", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Private Sub Button4_Click()";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="xui.MsgboxAsync(\"Received data:\", \"TIME AND DATE\"";
Debug.ShouldStop(1);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Received data:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("TIME AND DATE"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 4))))));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 10;BA.debugLine="Dim pass As String";
b4xmainpage._pass = RemoteObject.createImmutable("");__ref.setField("_pass",b4xmainpage._pass);
 //BA.debugLineNum = 11;BA.debugLine="Dim truepass As String";
b4xmainpage._truepass = RemoteObject.createImmutable("");__ref.setField("_truepass",b4xmainpage._truepass);
 //BA.debugLineNum = 12;BA.debugLine="Dim components() As String";
b4xmainpage._components = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});__ref.setField("_components",b4xmainpage._components);
 //BA.debugLineNum = 13;BA.debugLine="Dim MyBluetooth As Bluetooth";
b4xmainpage._mybluetooth = RemoteObject.createNew ("anywheresoftware.b4j.objects.Bluetooth");__ref.setField("_mybluetooth",b4xmainpage._mybluetooth);
 //BA.debugLineNum = 14;BA.debugLine="Private rp As RuntimePermissions";
b4xmainpage._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",b4xmainpage._rp);
 //BA.debugLineNum = 15;BA.debugLine="Private gmap As GoogleMap";
b4xmainpage._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");__ref.setField("_gmap",b4xmainpage._gmap);
 //BA.debugLineNum = 16;BA.debugLine="Private MapFragment1 As MapFragment";
b4xmainpage._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");__ref.setField("_mapfragment1",b4xmainpage._mapfragment1);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _connecttodevice(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConnectToDevice (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("connecttodevice")) { return __ref.runUserSub(false, "b4xmainpage","connecttodevice", __ref);}
RemoteObject _macaddress = RemoteObject.createImmutable("");
 BA.debugLineNum = 57;BA.debugLine="Sub ConnectToDevice";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim macAddress As String";
Debug.ShouldStop(33554432);
_macaddress = RemoteObject.createImmutable("");Debug.locals.put("macAddress", _macaddress);
 BA.debugLineNum = 59;BA.debugLine="macAddress = \"\"";
Debug.ShouldStop(67108864);
_macaddress = BA.ObjectToString("");Debug.locals.put("macAddress", _macaddress);
 BA.debugLineNum = 60;BA.debugLine="MyBluetooth.Connect(macAddress)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mybluetooth" /*RemoteObject*/ ).runVoidMethod ("Connect",(Object)(_macaddress));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="B4XPages.GetManager.LogEvents = True";
Debug.ShouldStop(1048576);
b4xmainpage._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_logevents" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mapfragment1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("mapfragment1_click")) { __ref.runUserSub(false, "b4xmainpage","mapfragment1_click", __ref); return;}
ResumableSub_MapFragment1_Click rsub = new ResumableSub_MapFragment1_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MapFragment1_Click extends BA.ResumableSub {
public ResumableSub_MapFragment1_Click(b4a.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 76;BA.debugLine="Wait For MapFragment1_Ready";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","mapfragment1_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "mapfragment1_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 77;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(4096);
__ref.setField ("_gmap" /*RemoteObject*/ ,__ref.getField(false,"_mapfragment1" /*RemoteObject*/ ).runMethod(false,"GetMap"));
 BA.debugLineNum = 78;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
Debug.ShouldStop(8192);
__ref.getField(false,"_rp" /*RemoteObject*/ ).runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_rp" /*RemoteObject*/ ).getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 79;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","activity_permissionresult", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "mapfragment1_click"), null);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 80;BA.debugLine="If Result Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 81;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(true,"setMyLocationEnabled",parent.__c.getField(true,"True"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 83;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","01114120",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _mapfragment1_ready(RemoteObject __ref) throws Exception{
}
public static void  _activity_permissionresult(RemoteObject __ref,RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _readbluetoothdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReadBluetoothData (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("readbluetoothdata")) { return __ref.runUserSub(false, "b4xmainpage","readbluetoothdata", __ref);}
RemoteObject _data = RemoteObject.createImmutable("");
 BA.debugLineNum = 63;BA.debugLine="Sub ReadBluetoothData";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim data As String";
Debug.ShouldStop(-2147483648);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 66;BA.debugLine="Log(\"Received data: \" & data)";
Debug.ShouldStop(2);
b4xmainpage.__c.runVoidMethod ("LogImpl","0917507",RemoteObject.concat(RemoteObject.createImmutable("Received data: "),_data),0);
 BA.debugLineNum = 67;BA.debugLine="components = Regex.Split(\";\",\"Received data\" & da";
Debug.ShouldStop(4);
__ref.setField ("_components" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Received data"),_data))));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}