
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _pass = RemoteObject.createImmutable("");
public static RemoteObject _truepass = RemoteObject.createImmutable("");
public static RemoteObject _components = null;
public static RemoteObject _mybluetooth = RemoteObject.declareNull("anywheresoftware.b4j.objects.Bluetooth");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _gmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
public static RemoteObject _mapfragment1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"components",_ref.getField(false, "_components"),"DateUtils",_ref.getField(false, "_dateutils"),"gmap",_ref.getField(false, "_gmap"),"MapFragment1",_ref.getField(false, "_mapfragment1"),"MyBluetooth",_ref.getField(false, "_mybluetooth"),"pass",_ref.getField(false, "_pass"),"Root",_ref.getField(false, "_root"),"rp",_ref.getField(false, "_rp"),"truepass",_ref.getField(false, "_truepass"),"xui",_ref.getField(false, "_xui")};
}
}