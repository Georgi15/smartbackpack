package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String[] _components = null;
public anywheresoftware.b4a.objects.Serial _mybluetooth = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public String _data = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _activity_create(b4a.example.b4xmainpage __ref,boolean _firsttime) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activity_create", false))
	 {return ((String) Debug.delegate(ba, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="MyBluetooth.Initialize(\"MyBluetooth\")";
__ref._mybluetooth /*anywheresoftware.b4a.objects.Serial*/ .Initialize("MyBluetooth");
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="MyBluetooth.Listen";
__ref._mybluetooth /*anywheresoftware.b4a.objects.Serial*/ .Listen(ba);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"hacktues\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("hacktues",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _bt_connected(b4a.example.b4xmainpage __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "bt_connected", false))
	 {return ((String) Debug.delegate(ba, "bt_connected", new Object[] {_success}));}
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Sub bt_Connected (Success As Boolean)";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="Log(\"Bluetooth connected\")";
__c.LogImpl("637617666","Bluetooth connected",0);
 }else {
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="Log(\"Bluetooth connection failed\")";
__c.LogImpl("637617668","Bluetooth connection failed",0);
 };
RDebugUtils.currentLine=37617670;
 //BA.debugLineNum = 37617670;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub Button1_Click()";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="xui.MsgboxAsync(\"data:\", \"\" &data )";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("data:"),BA.ObjectToCharSequence(""+__ref._data /*String*/ ));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="xui.MsgboxAsync(\"Air Humidity :\", \"\"  & component";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Air Humidity :"),BA.ObjectToCharSequence(""+__ref._components /*String[]*/ [(int) (0)]));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="xui.MsgboxAsync(\"tempreture :\", \"\" & components(1";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("tempreture :"),BA.ObjectToCharSequence(""+__ref._components /*String[]*/ [(int) (1)]));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="End Sub";
return "";
}
public void  _button2_click(b4a.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button2_click", false))
	 {Debug.delegate(ba, "button2_click", null); return;}
ResumableSub_Button2_Click rsub = new ResumableSub_Button2_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button2_Click extends BA.ResumableSub {
public ResumableSub_Button2_Click(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
String _permission = "";
boolean _result = false;
uk.co.martinpearman.b4a.osmdroid.views.overlays.wrappers.MyOverlayItemWrapper _waypointmarker = null;
String _latitude = "";
String _longtitude = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Root.LoadLayout(\"MapFragment1\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MapFragment1",ba);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Wait For MapFragment1_Ready";
parent.__c.WaitFor("mapfragment1_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "button2_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="gmap = MapFragment1.GetMap";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/  = __ref._mapfragment1 /*anywheresoftware.b4a.objects.MapFragmentWrapper*/ .GetMap();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(ba,__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
parent.__c.WaitFor("activity_permissionresult", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "button2_click"), null);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_permission = (String) result[1];
_result = (Boolean) result[2];
;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="If Result Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="gmap.MyLocationEnabled = True";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .setMyLocationEnabled(parent.__c.True);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim WaypointMarker As Marker";
_waypointmarker = new uk.co.martinpearman.b4a.osmdroid.views.overlays.wrappers.MyOverlayItemWrapper();
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Dim Latitude As String";
_latitude = "";
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Dim Longtitude As String";
_longtitude = "";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="Log(\"No permission!\")";
parent.__c.LogImpl("61048592","No permission!",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _button3_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button3_click", false))
	 {return ((String) Debug.delegate(ba, "button3_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Button3_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Root.LoadLayout(\"hacktues\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("hacktues",ba);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public String  _button4_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button4_click", false))
	 {return ((String) Debug.delegate(ba, "button4_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub Button4_Click()";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="xui.MsgboxAsync(\"day:\", \"TIME AND DATE\" &componen";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("day:"),BA.ObjectToCharSequence("TIME AND DATE"+__ref._components /*String[]*/ [(int) (2)]));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="xui.MsgboxAsync(\"month:\", \"TIME AND DATE\" &compon";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("month:"),BA.ObjectToCharSequence("TIME AND DATE"+__ref._components /*String[]*/ [(int) (3)]));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="xui.MsgboxAsync(\"year:\", \"TIME AND DATE\" &compone";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("year:"),BA.ObjectToCharSequence("TIME AND DATE"+__ref._components /*String[]*/ [(int) (4)]));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="xui.MsgboxAsync(\"hour:\", \"TIME AND DATE\" &compone";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("hour:"),BA.ObjectToCharSequence("TIME AND DATE"+__ref._components /*String[]*/ [(int) (5)]));
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="xui.MsgboxAsync(\"minute:\", \"TIME AND DATE\" &compo";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("minute:"),BA.ObjectToCharSequence("TIME AND DATE"+__ref._components /*String[]*/ [(int) (6)]));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim components() As String";
_components = new String[(int) (0)];
java.util.Arrays.fill(_components,"");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim MyBluetooth As Serial";
_mybluetooth = new anywheresoftware.b4a.objects.Serial();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private gmap As GoogleMap";
_gmap = new anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Private MapFragment1 As MapFragment";
_mapfragment1 = new anywheresoftware.b4a.objects.MapFragmentWrapper();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Dim data As String";
_data = "";
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="B4XPages.GetManager.LogEvents = True";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._logevents /*boolean*/  = __c.True;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _readbluetoothdata(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "readbluetoothdata", false))
	 {return ((String) Debug.delegate(ba, "readbluetoothdata", null));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Sub ReadBluetoothData";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="Dim data As String";
_data = "";
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="data = MyBluetooth.InputStream";
__ref._data /*String*/  = BA.ObjectToString(__ref._mybluetooth /*anywheresoftware.b4a.objects.Serial*/ .getInputStream());
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="Log(\"Received data: \" & data)";
__c.LogImpl("637552131","Received data: "+__ref._data /*String*/ ,0);
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="components = Regex.Split(\"\\|\", data)";
__ref._components /*String[]*/  = __c.Regex.Split("\\|",__ref._data /*String*/ );
RDebugUtils.currentLine=37552133;
 //BA.debugLineNum = 37552133;BA.debugLine="End Sub";
return "";
}
}