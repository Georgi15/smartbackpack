package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _activity_create(RemoteObject __ref,RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("activity_create")) { return __ref.runUserSub(false, "b4xmainpage","activity_create", __ref, _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="MyBluetooth.Initialize(\"MyBluetooth\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mybluetooth" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("MyBluetooth")));
 BA.debugLineNum = 33;BA.debugLine="MyBluetooth.Listen";
Debug.ShouldStop(1);
__ref.getField(false,"_mybluetooth" /*RemoteObject*/ ).runVoidMethod ("Listen",__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"hacktues\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("hacktues")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bt_connected(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("bt_Connected (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("bt_connected")) { return __ref.runUserSub(false, "b4xmainpage","bt_connected", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 35;BA.debugLine="Sub bt_Connected (Success As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If Success Then";
Debug.ShouldStop(8);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 37;BA.debugLine="Log(\"Bluetooth connected\")";
Debug.ShouldStop(16);
b4xmainpage.__c.runVoidMethod ("LogImpl","637617666",RemoteObject.createImmutable("Bluetooth connected"),0);
 }else {
 BA.debugLineNum = 39;BA.debugLine="Log(\"Bluetooth connection failed\")";
Debug.ShouldStop(64);
b4xmainpage.__c.runVoidMethod ("LogImpl","637617668",RemoteObject.createImmutable("Bluetooth connection failed"),0);
 };
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Private Sub Button1_Click()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="xui.MsgboxAsync(\"data:\", \"\" &data )";
Debug.ShouldStop(65536);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("data:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),__ref.getField(true,"_data" /*RemoteObject*/ )))));
 BA.debugLineNum = 50;BA.debugLine="xui.MsgboxAsync(\"Air Humidity :\", \"\"  & component";
Debug.ShouldStop(131072);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Air Humidity :")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 51;BA.debugLine="xui.MsgboxAsync(\"tempreture :\", \"\" & components(1";
Debug.ShouldStop(262144);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("tempreture :")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(""),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("button2_click")) { __ref.runUserSub(false, "b4xmainpage","button2_click", __ref); return;}
ResumableSub_Button2_Click rsub = new ResumableSub_Button2_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button2_Click extends BA.ResumableSub {
public ResumableSub_Button2_Click(b4a.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _waypointmarker = RemoteObject.declareNull("uk.co.martinpearman.b4a.osmdroid.views.overlays.wrappers.MyOverlayItemWrapper");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longtitude = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,53);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 54;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 55;BA.debugLine="Root.LoadLayout(\"MapFragment1\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MapFragment1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 56;BA.debugLine="Wait For MapFragment1_Ready";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","mapfragment1_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "button2_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 57;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(16777216);
__ref.setField ("_gmap" /*RemoteObject*/ ,__ref.getField(false,"_mapfragment1" /*RemoteObject*/ ).runMethod(false,"GetMap"));
 BA.debugLineNum = 58;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
Debug.ShouldStop(33554432);
__ref.getField(false,"_rp" /*RemoteObject*/ ).runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_rp" /*RemoteObject*/ ).getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 59;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","activity_permissionresult", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "button2_click"), null);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 60;BA.debugLine="If Result Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 61;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(true,"setMyLocationEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="Dim WaypointMarker As Marker";
Debug.ShouldStop(536870912);
_waypointmarker = RemoteObject.createNew ("uk.co.martinpearman.b4a.osmdroid.views.overlays.wrappers.MyOverlayItemWrapper");Debug.locals.put("WaypointMarker", _waypointmarker);
 BA.debugLineNum = 63;BA.debugLine="Dim Latitude As String";
Debug.ShouldStop(1073741824);
_latitude = RemoteObject.createImmutable("");Debug.locals.put("Latitude", _latitude);
 BA.debugLineNum = 64;BA.debugLine="Dim Longtitude As String";
Debug.ShouldStop(-2147483648);
_longtitude = RemoteObject.createImmutable("");Debug.locals.put("Longtitude", _longtitude);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 69;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","61048592",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _button3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("button3_click")) { return __ref.runUserSub(false, "b4xmainpage","button3_click", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Private Sub Button3_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(256);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 74;BA.debugLine="Root.LoadLayout(\"hacktues\")";
Debug.ShouldStop(512);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("hacktues")),__ref.getField(false, "ba"));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Button4_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("button4_click")) { return __ref.runUserSub(false, "b4xmainpage","button4_click", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Private Sub Button4_Click()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="xui.MsgboxAsync(\"day:\", \"TIME AND DATE\" &componen";
Debug.ShouldStop(4096);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("day:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("TIME AND DATE"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 78;BA.debugLine="xui.MsgboxAsync(\"month:\", \"TIME AND DATE\" &compon";
Debug.ShouldStop(8192);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("month:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("TIME AND DATE"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 79;BA.debugLine="xui.MsgboxAsync(\"year:\", \"TIME AND DATE\" &compone";
Debug.ShouldStop(16384);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("year:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("TIME AND DATE"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 4))))));
 BA.debugLineNum = 80;BA.debugLine="xui.MsgboxAsync(\"hour:\", \"TIME AND DATE\" &compone";
Debug.ShouldStop(32768);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("hour:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("TIME AND DATE"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 81;BA.debugLine="xui.MsgboxAsync(\"minute:\", \"TIME AND DATE\" &compo";
Debug.ShouldStop(65536);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("minute:")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("TIME AND DATE"),__ref.getField(false,"_components" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, 6))))));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
 //BA.debugLineNum = 10;BA.debugLine="Dim components() As String";
b4xmainpage._components = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});__ref.setField("_components",b4xmainpage._components);
 //BA.debugLineNum = 11;BA.debugLine="Dim MyBluetooth As Serial";
b4xmainpage._mybluetooth = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial");__ref.setField("_mybluetooth",b4xmainpage._mybluetooth);
 //BA.debugLineNum = 12;BA.debugLine="Private rp As RuntimePermissions";
b4xmainpage._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",b4xmainpage._rp);
 //BA.debugLineNum = 13;BA.debugLine="Private gmap As GoogleMap";
b4xmainpage._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");__ref.setField("_gmap",b4xmainpage._gmap);
 //BA.debugLineNum = 14;BA.debugLine="Private MapFragment1 As MapFragment";
b4xmainpage._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");__ref.setField("_mapfragment1",b4xmainpage._mapfragment1);
 //BA.debugLineNum = 15;BA.debugLine="Dim data As String";
b4xmainpage._data = RemoteObject.createImmutable("");__ref.setField("_data",b4xmainpage._data);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="B4XPages.GetManager.LogEvents = True";
Debug.ShouldStop(524288);
b4xmainpage._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_logevents" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readbluetoothdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReadBluetoothData (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("readbluetoothdata")) { return __ref.runUserSub(false, "b4xmainpage","readbluetoothdata", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Sub ReadBluetoothData";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim data As String";
Debug.ShouldStop(1024);
b4xmainpage._data = RemoteObject.createImmutable("");__ref.setField("_data",b4xmainpage._data);
 BA.debugLineNum = 44;BA.debugLine="data = MyBluetooth.InputStream";
Debug.ShouldStop(2048);
__ref.setField ("_data" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_mybluetooth" /*RemoteObject*/ ).runMethod(false,"getInputStream")));
 BA.debugLineNum = 45;BA.debugLine="Log(\"Received data: \" & data)";
Debug.ShouldStop(4096);
b4xmainpage.__c.runVoidMethod ("LogImpl","637552131",RemoteObject.concat(RemoteObject.createImmutable("Received data: "),__ref.getField(true,"_data" /*RemoteObject*/ )),0);
 BA.debugLineNum = 46;BA.debugLine="components = Regex.Split(\"\\|\", data)";
Debug.ShouldStop(8192);
__ref.setField ("_components" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(__ref.getField(true,"_data" /*RemoteObject*/ ))));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}