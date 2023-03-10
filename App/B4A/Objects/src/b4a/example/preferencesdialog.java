package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class preferencesdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.preferencesdialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.preferencesdialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xprefitem{
public boolean IsInitialized;
public Object Title;
public int ItemType;
public anywheresoftware.b4a.objects.collections.Map Extra;
public String Key;
public boolean Required;
public void Initialize() {
IsInitialized = true;
Title = new Object();
ItemType = 0;
Extra = new anywheresoftware.b4a.objects.collections.Map();
Key = "";
Required = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4a.example3.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.collections.List _prefitems = null;
public int _type_boolean = 0;
public int _type_text = 0;
public int _type_date = 0;
public int _type_options = 0;
public int _type_color = 0;
public int _type_separator = 0;
public int _type_number = 0;
public int _type_password = 0;
public int _type_shortoptions = 0;
public int _type_decimalnumber = 0;
public int _type_multilinetext = 0;
public int _type_time = 0;
public int _type_numericrange = 0;
public int _type_explanation = 0;
public b4a.example.b4xdatetemplate _datetemplate = null;
public b4a.example.b4xlongtexttemplate _longtexttemplate = null;
public b4a.example.b4xdialog _dialog = null;
public int _result_showing_nested_dialog = 0;
public int _nesteddialogitemindex = 0;
public Object _mtitle = null;
public b4a.example.b4xsearchtemplate _searchtemplate = null;
public Object _template = null;
public b4a.example.b4xcolortemplate _colortemplate = null;
public b4a.example.b4xcombobox _b4xcombobox1 = null;
public int _theme_dark = 0;
public int _theme_light = 0;
public int _mtheme = 0;
public int _itemsbackgroundcolor = 0;
public int _textcolor = 0;
public int _separatorbackgroundcolor = 0;
public int _separatortextcolor = 0;
public Object _mcallback = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaulthintfont = null;
public int _defaulthintlargesize = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _addbooleanitem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addbooleanitem", true))
	 {return ((String) Debug.delegate(ba, "addbooleanitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub AddBooleanItem (Key As String, Title As";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_BOOLEAN,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_boolean /*int*/ ,_key)));
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="End Sub";
return "";
}
public b4a.example.preferencesdialog._b4xprefitem  _createprefitem(b4a.example.preferencesdialog __ref,Object _title,int _itemtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createprefitem", true))
	 {return ((b4a.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "createprefitem", new Object[] {_title,_itemtype,_key}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub CreatePrefItem(Title As Object, ItemTy";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim pi As B4XPrefItem";
_pi = new b4a.example.preferencesdialog._b4xprefitem();
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="pi.Initialize";
_pi.Initialize();
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="pi.ItemType = ItemType";
_pi.ItemType /*int*/  = _itemtype;
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="pi.Key = Key";
_pi.Key /*String*/  = _key;
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="End Sub";
return null;
}
public String  _addcoloritem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addcoloritem", true))
	 {return ((String) Debug.delegate(ba, "addcoloritem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub AddColorItem(Key As String, Title As Ob";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="If ColorTemplate.IsInitialized = False Then";
if (__ref._colortemplate /*b4a.example.b4xcolortemplate*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="ColorTemplate.Initialize";
__ref._colortemplate /*b4a.example.b4xcolortemplate*/ ._initialize /*String*/ (null,ba);
 };
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_COLOR, K";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_color /*int*/ ,_key)));
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="End Sub";
return "";
}
public String  _adddateitem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddateitem", true))
	 {return ((String) Debug.delegate(ba, "adddateitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub AddDateItem (Key As String, Title As Ob";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DATE, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_date /*int*/ ,_key)));
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
return "";
}
public String  _adddecimalnumberitem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddecimalnumberitem", true))
	 {return ((String) Debug.delegate(ba, "adddecimalnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub AddDecimalNumberItem (Key As String, Ti";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DECIMALN";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_decimalnumber /*int*/ ,_key)));
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="End Sub";
return "";
}
public String  _addexplanationitem(b4a.example.preferencesdialog __ref,String _key,Object _title,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addexplanationitem", true))
	 {return ((String) Debug.delegate(ba, "addexplanationitem", new Object[] {_key,_title,_text}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub AddExplanationItem (Key As String, Titl";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_explanation /*int*/ ,_key);
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="pi.Extra = CreateMap(\"text\": Text)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("text"),_text});
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="End Sub";
return "";
}
public String  _addmultilinetextitem(b4a.example.preferencesdialog __ref,String _key,Object _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addmultilinetextitem", true))
	 {return ((String) Debug.delegate(ba, "addmultilinetextitem", new Object[] {_key,_title,_height}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub AddMultilineTextItem (Key As String, Ti";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_multilinetext /*int*/ ,_key);
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="pi.Extra = CreateMap(\"height\": Height)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("height"),(Object)(_height)});
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="End Sub";
return "";
}
public String  _addnumberitem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumberitem", true))
	 {return ((String) Debug.delegate(ba, "addnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub AddNumberItem (Key As String, Title As";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_NUMBER,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_number /*int*/ ,_key)));
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="End Sub";
return "";
}
public String  _addnumericrangeitem(b4a.example.preferencesdialog __ref,String _key,Object _title,double _rangestart,double _rangeend,double _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "addnumericrangeitem", new Object[] {_key,_title,_rangestart,_rangeend,_interval}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub AddNumericRangeItem (Key As String, Tit";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_numericrange /*int*/ ,_key);
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="pi.Extra = CreateMap(\"start\": RangeStart, \"end\":";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("start"),(Object)(_rangestart),(Object)("end"),(Object)(_rangeend),(Object)("interval"),(Object)(_interval)});
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="End Sub";
return "";
}
public String  _addoptionsitem(b4a.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addoptionsitem", new Object[] {_key,_title,_options}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub AddOptionsItem (Key As String, Title As";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_options /*int*/ ,_key);
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="End Sub";
return "";
}
public String  _addpassworditem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addpassworditem", true))
	 {return ((String) Debug.delegate(ba, "addpassworditem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub AddPasswordItem (Key As String, Title A";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_PASSWORD";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_password /*int*/ ,_key)));
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="End Sub";
return "";
}
public String  _addseparator(b4a.example.preferencesdialog __ref,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addseparator", true))
	 {return ((String) Debug.delegate(ba, "addseparator", new Object[] {_title}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub AddSeparator (Title As Object)";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_SEPARATO";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_separator /*int*/ ,"")));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="End Sub";
return "";
}
public String  _addshortoptionsitem(b4a.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addshortoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addshortoptionsitem", new Object[] {_key,_title,_options}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub AddShortOptionsItem (Key As String, Tit";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_shortoptions /*int*/ ,_key);
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtextitem", true))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub AddTextItem (Key As String, Title As Ob";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_TEXT, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_text /*int*/ ,_key)));
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return "";
}
public String  _addtimeitem(b4a.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtimeitem", true))
	 {return ((String) Debug.delegate(ba, "addtimeitem", new Object[] {_key,_title}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub AddTimeItem (Key As String, Title As Ob";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_time /*int*/ ,_key);
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="pi.Extra = CreateMap(\"24\": False)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("24"),(Object)(__c.False)});
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="End Sub";
return "";
}
public String  _b4xcombobox1_selectedindexchanged(b4a.example.preferencesdialog __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xcombobox1_selectedindexchanged", true))
	 {return ((String) Debug.delegate(ba, "b4xcombobox1_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
public String  _b4xswitch1_valuechanged(b4a.example.preferencesdialog __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xswitch1_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "b4xswitch1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return "";
}
public boolean  _backkeypressed(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "backkeypressed", true))
	 {return ((Boolean) Debug.delegate(ba, "backkeypressed", null));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub BackKeyPressed As Boolean";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4a.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
__ref._dialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Type B4XPrefItem (Title As Object, ItemType As In";
;
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="Public PrefItems As List";
_prefitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="Public TYPE_BOOLEAN = 1, TYPE_TEXT = 2, TYPE_DATE";
_type_boolean = (int) (1);
_type_text = (int) (2);
_type_date = (int) (3);
_type_options = (int) (4);
_type_color = (int) (5);
_type_separator = (int) (6);
_type_number = (int) (7);
_type_password = (int) (8);
_type_shortoptions = (int) (9);
_type_decimalnumber = (int) (10);
_type_multilinetext = (int) (11);
_type_time = (int) (12);
_type_numericrange = (int) (13);
_type_explanation = (int) (14);
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Public DateTemplate As B4XDateTemplate";
_datetemplate = new b4a.example.b4xdatetemplate();
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="Public LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4a.example.b4xlongtexttemplate();
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="Public Dialog As B4XDialog";
_dialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="Private RESULT_SHOWING_NESTED_DIALOG As Int = 100";
_result_showing_nested_dialog = (int) (100);
RDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="Private NestedDialogItemIndex As Int";
_nesteddialogitemindex = 0;
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="Private mTitle As Object";
_mtitle = new Object();
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="Public SearchTemplate As B4XSearchTemplate";
_searchtemplate = new b4a.example.b4xsearchtemplate();
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="Private Template As Object";
_template = new Object();
RDebugUtils.currentLine=10354705;
 //BA.debugLineNum = 10354705;BA.debugLine="Public ColorTemplate As B4XColorTemplate";
_colortemplate = new b4a.example.b4xcolortemplate();
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new b4a.example.b4xcombobox();
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="Public const THEME_DARK = 1, THEME_LIGHT = 2 As I";
_theme_dark = (int) (1);
_theme_light = (int) (2);
RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="Private mTheme As Int";
_mtheme = 0;
RDebugUtils.currentLine=10354709;
 //BA.debugLineNum = 10354709;BA.debugLine="Public ItemsBackgroundColor As Int";
_itemsbackgroundcolor = 0;
RDebugUtils.currentLine=10354710;
 //BA.debugLineNum = 10354710;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=10354711;
 //BA.debugLineNum = 10354711;BA.debugLine="Public SeparatorBackgroundColor, SeparatorTextCol";
_separatorbackgroundcolor = 0;
_separatortextcolor = 0;
RDebugUtils.currentLine=10354712;
 //BA.debugLineNum = 10354712;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=10354713;
 //BA.debugLineNum = 10354713;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=10354714;
 //BA.debugLineNum = 10354714;BA.debugLine="Public DefaultHintFont As B4XFont";
_defaulthintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=10354715;
 //BA.debugLineNum = 10354715;BA.debugLine="Public DefaultHintLargeSize As Int";
_defaulthintlargesize = 0;
RDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="PrefItems.Clear";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4a.example.preferencesdialog __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="End Sub";
return "";
}
public boolean  _commitchanges(b4a.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "commitchanges", true))
	 {return ((Boolean) Debug.delegate(ba, "commitchanges", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _temp = null;
int _i = 0;
b4a.example3.customlistview._clvitem _item = null;
b4a.example.preferencesdialog._b4xprefitem _prefitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _itempanel = null;
boolean _required = false;
Object _value = null;
b4a.example.b4xswitch _switch = null;
b4a.example.b4xfloattextfield _ft = null;
double _n = 0;
int _n2 = 0;
b4a.example.b4xplusminus _pmhours = null;
b4a.example.b4xplusminus _pmminutes = null;
b4a.example.b4xplusminus _pmampm = null;
b4a.example.dateutils._period _p = null;
b4a.example.b4xplusminus _pm = null;
b4a.example.b4xcombobox _cmb = null;
boolean _valid = false;
String _key = "";
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Private Sub CommitChanges (Data As Map) As Boolean";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Dim Temp As Map";
_temp = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4a.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4a.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="Dim Required As Boolean = PrefItem.Required";
_required = _prefitem.Required /*boolean*/ ;
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="Dim Value As Object";
_value = new Object();
RDebugUtils.currentLine=12713994;
 //BA.debugLineNum = 12713994;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ )) {
case 0: {
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4a.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="Value = switch.Value";
_value = (Object)(_switch._getvalue /*boolean*/ (null));
 break; }
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=12713999;
 //BA.debugLineNum = 12713999;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4a.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12714000;
 //BA.debugLineNum = 12714000;BA.debugLine="Value = ft.Text";
_value = (Object)(_ft._gettext /*String*/ (null));
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=12714003;
 //BA.debugLineNum = 12714003;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4a.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12714004;
 //BA.debugLineNum = 12714004;BA.debugLine="Dim n As Double";
_n = 0;
RDebugUtils.currentLine=12714005;
 //BA.debugLineNum = 12714005;BA.debugLine="If ft.Text <> \"\" Then";
if ((_ft._gettext /*String*/ (null)).equals("") == false) { 
RDebugUtils.currentLine=12714006;
 //BA.debugLineNum = 12714006;BA.debugLine="If IsNumber(ft.Text) Then";
if (__c.IsNumber(_ft._gettext /*String*/ (null))) { 
RDebugUtils.currentLine=12714007;
 //BA.debugLineNum = 12714007;BA.debugLine="n = ft.Text";
_n = (double)(Double.parseDouble(_ft._gettext /*String*/ (null)));
RDebugUtils.currentLine=12714008;
 //BA.debugLineNum = 12714008;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
RDebugUtils.currentLine=12714009;
 //BA.debugLineNum = 12714009;BA.debugLine="Dim n2 As Int = n";
_n2 = (int) (_n);
RDebugUtils.currentLine=12714010;
 //BA.debugLineNum = 12714010;BA.debugLine="Value = n2";
_value = (Object)(_n2);
 }else {
RDebugUtils.currentLine=12714012;
 //BA.debugLineNum = 12714012;BA.debugLine="Value = n";
_value = (Object)(_n);
 };
 }else {
RDebugUtils.currentLine=12714015;
 //BA.debugLineNum = 12714015;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=12714016;
 //BA.debugLineNum = 12714016;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }else {
RDebugUtils.currentLine=12714019;
 //BA.debugLineNum = 12714019;BA.debugLine="Value = \"\"";
_value = (Object)("");
 };
 break; }
case 6: {
RDebugUtils.currentLine=12714022;
 //BA.debugLineNum = 12714022;BA.debugLine="Value = DateTime.DateParse(ItemPanel.GetView(1";
_value = (Object)(__c.DateTime.DateParse(_itempanel.GetView((int) (1)).getText()));
 break; }
case 7: {
RDebugUtils.currentLine=12714024;
 //BA.debugLineNum = 12714024;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12714025;
 //BA.debugLineNum = 12714025;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=12714026;
 //BA.debugLineNum = 12714026;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=12714027;
 //BA.debugLineNum = 12714027;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=12714028;
 //BA.debugLineNum = 12714028;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=12714029;
 //BA.debugLineNum = 12714029;BA.debugLine="p.Hours = pmHours.SelectedValue";
_p.Hours = (int)(BA.ObjectToNumber(_pmhours._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=12714030;
 //BA.debugLineNum = 12714030;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=12714031;
 //BA.debugLineNum = 12714031;BA.debugLine="If p.Hours = 12 Then p.Hours = 0";
if (_p.Hours==12) { 
_p.Hours = (int) (0);};
RDebugUtils.currentLine=12714032;
 //BA.debugLineNum = 12714032;BA.debugLine="If pmAMPM.SelectedValue = \"pm\" Then p.Hours =";
if ((_pmampm._getselectedvalue /*Object*/ (null)).equals((Object)("pm"))) { 
_p.Hours = (int) (_p.Hours+12);};
 };
RDebugUtils.currentLine=12714034;
 //BA.debugLineNum = 12714034;BA.debugLine="p.Minutes = pmMinutes.SelectedValue";
_p.Minutes = (int)(BA.ObjectToNumber(_pmminutes._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=12714035;
 //BA.debugLineNum = 12714035;BA.debugLine="Value = p";
_value = (Object)(_p);
 break; }
case 8: {
RDebugUtils.currentLine=12714037;
 //BA.debugLineNum = 12714037;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12714038;
 //BA.debugLineNum = 12714038;BA.debugLine="Value = pm.SelectedValue";
_value = _pm._getselectedvalue /*Object*/ (null);
 break; }
case 9: {
RDebugUtils.currentLine=12714040;
 //BA.debugLineNum = 12714040;BA.debugLine="Value = ItemPanel.GetView(1).Text";
_value = (Object)(_itempanel.GetView((int) (1)).getText());
 break; }
case 10: {
RDebugUtils.currentLine=12714042;
 //BA.debugLineNum = 12714042;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4a.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=12714043;
 //BA.debugLineNum = 12714043;BA.debugLine="If cmb.SelectedIndex > -1 Then Value = cmb.Get";
if (_cmb._getselectedindex /*int*/ (null)>-1) { 
_value = (Object)(_cmb._getitem /*String*/ (null,_cmb._getselectedindex /*int*/ (null)));}
else {
_value = (Object)("");};
 break; }
case 11: {
RDebugUtils.currentLine=12714045;
 //BA.debugLineNum = 12714045;BA.debugLine="Value = ItemPanel.GetView(1).Color";
_value = (Object)(_itempanel.GetView((int) (1)).getColor());
 break; }
case 12: 
case 13: {
RDebugUtils.currentLine=12714047;
 //BA.debugLineNum = 12714047;BA.debugLine="Continue";
if (true) continue;
 break; }
}
;
RDebugUtils.currentLine=12714049;
 //BA.debugLineNum = 12714049;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=12714050;
 //BA.debugLineNum = 12714050;BA.debugLine="If Required Then";
if (_required) { 
RDebugUtils.currentLine=12714051;
 //BA.debugLineNum = 12714051;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=12714052;
 //BA.debugLineNum = 12714052;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=12714054;
 //BA.debugLineNum = 12714054;BA.debugLine="Continue";
if (true) continue;
 };
 };
RDebugUtils.currentLine=12714057;
 //BA.debugLineNum = 12714057;BA.debugLine="Temp.Put(PrefItem.Key, Value)";
_temp.Put((Object)(_prefitem.Key /*String*/ ),_value);
 }
};
RDebugUtils.currentLine=12714059;
 //BA.debugLineNum = 12714059;BA.debugLine="If mEventName <> \"\" And xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(int) (1))) { 
RDebugUtils.currentLine=12714060;
 //BA.debugLineNum = 12714060;BA.debugLine="Dim Valid As Boolean = CallSub2(mCallback, mEven";
_valid = BA.ObjectToBoolean(__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(Object)(_temp)));
RDebugUtils.currentLine=12714061;
 //BA.debugLineNum = 12714061;BA.debugLine="If Valid = False Then Return False";
if (_valid==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=12714063;
 //BA.debugLineNum = 12714063;BA.debugLine="For Each key As String In Temp.Keys";
{
final anywheresoftware.b4a.BA.IterableList group78 = _temp.Keys();
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_key = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=12714064;
 //BA.debugLineNum = 12714064;BA.debugLine="Data.Put(key, Temp.Get(key))";
_data.Put((Object)(_key),_temp.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=12714066;
 //BA.debugLineNum = 12714066;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=12714067;
 //BA.debugLineNum = 12714067;BA.debugLine="End Sub";
return false;
}
public void  _gotoitem(b4a.example.preferencesdialog __ref,int _i) throws Exception{
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gotoitem", true))
	 {Debug.delegate(ba, "gotoitem", new Object[] {_i}); return;}
ResumableSub_GoToItem rsub = new ResumableSub_GoToItem(this,__ref,_i);
rsub.resume(ba, null);
}
public static class ResumableSub_GoToItem extends BA.ResumableSub {
public ResumableSub_GoToItem(b4a.example.preferencesdialog parent,b4a.example.preferencesdialog __ref,int _i) {
this.parent = parent;
this.__ref = __ref;
this._i = _i;
this.__ref = parent;
}
b4a.example.preferencesdialog __ref;
b4a.example.preferencesdialog parent;
int _i;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _duration = 0;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preferencesdialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="CustomListView1.JumpToItem(i)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._jumptoitem(_i);
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="For i = 0 To 3";
if (true) break;

case 1:
//for
this.state = 4;
step3 = 1;
limit3 = (int) (3);
_i = (int) (0) ;
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Dim duration As Int = 100 - i * 20";
_duration = (int) (100-_i*20);
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="p.SetLayoutAnimated(duration, -10dip, 0, p.Width";
_p.SetLayoutAnimated(_duration,(int) (-parent.__c.DipToCurrent((int) (10))),(int) (0),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="p.SetLayoutAnimated(duration, 10dip, 0, p.Width,";
_p.SetLayoutAnimated(_duration,parent.__c.DipToCurrent((int) (10)),(int) (0),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="p.SetLayoutAnimated(50, 0, 0, p.Width, p.Height)";
_p.SetLayoutAnimated((int) (50),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.preferencesdialog __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlayouts(b4a.example.preferencesdialog __ref,b4a.example.preferencesdialog._b4xprefitem _prefitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createlayouts", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlayouts", new Object[] {_prefitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
b4a.example.b4xfloattextfield _ft = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
anywheresoftware.b4a.objects.collections.List _original = null;
anywheresoftware.b4a.objects.SpinnerWrapper _spnr = null;
anywheresoftware.b4a.objects.collections.List _options = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
String _opt = "";
b4a.example.b4xfloattextfield _tf = null;
anywheresoftware.b4a.objects.EditTextWrapper _ed = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4a.objects.LabelWrapper _rlbl = null;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub CreateLayouts (PrefItem As B4XPrefItem";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="p.Width = CustomListView1.sv.ScrollViewContentWid";
_p.setWidth(__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="p.Height = 50dip";
_p.setHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_separator /*int*/ )) {
case 0: {
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="p.LoadLayout(\"booleanitem\")";
_p.LoadLayout("booleanitem",ba);
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4a.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=12517386;
 //BA.debugLineNum = 12517386;BA.debugLine="p.Height = PrefItem.Extra.Get(\"height\")";
_p.setHeight((int)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))));
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="p.LoadLayout(\"textitemmulti\")";
_p.LoadLayout("textitemmulti",ba);
RDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4a.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12517389;
 //BA.debugLineNum = 12517389;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=12517392;
 //BA.debugLineNum = 12517392;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=12517394;
 //BA.debugLineNum = 12517394;BA.debugLine="CreateTimeItem(PrefItem, p)";
__ref._createtimeitem /*String*/ (null,_prefitem,_p);
 break; }
case 3: {
RDebugUtils.currentLine=12517396;
 //BA.debugLineNum = 12517396;BA.debugLine="CreateNumericRangeItem(PrefItem, p)";
__ref._createnumericrangeitem /*String*/ (null,_prefitem,_p);
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=12517398;
 //BA.debugLineNum = 12517398;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=12517399;
 //BA.debugLineNum = 12517399;BA.debugLine="If PrefItem.ItemType = TYPE_PASSWORD Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_password /*int*/ ) { 
RDebugUtils.currentLine=12517400;
 //BA.debugLineNum = 12517400;BA.debugLine="p.LoadLayout(\"passworditem\")";
_p.LoadLayout("passworditem",ba);
 }else {
RDebugUtils.currentLine=12517402;
 //BA.debugLineNum = 12517402;BA.debugLine="p.LoadLayout(\"textitem\")";
_p.LoadLayout("textitem",ba);
RDebugUtils.currentLine=12517403;
 //BA.debugLineNum = 12517403;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4a.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12517404;
 //BA.debugLineNum = 12517404;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
RDebugUtils.currentLine=12517406;
 //BA.debugLineNum = 12517406;BA.debugLine="Dim et As EditText = ft.TextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ft._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=12517407;
 //BA.debugLineNum = 12517407;BA.debugLine="et.InputType = et.INPUT_TYPE_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_NUMBERS);
 }else 
{RDebugUtils.currentLine=12517412;
 //BA.debugLineNum = 12517412;BA.debugLine="Else If PrefItem.ItemType = TYPE_DECIMALNUMBER";
if (_prefitem.ItemType /*int*/ ==__ref._type_decimalnumber /*int*/ ) { 
RDebugUtils.currentLine=12517414;
 //BA.debugLineNum = 12517414;BA.debugLine="Dim et As EditText = ft.TextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_ft._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=12517415;
 //BA.debugLineNum = 12517415;BA.debugLine="et.InputType = et.INPUT_TYPE_DECIMAL_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_DECIMAL_NUMBERS);
 }}
;
 };
RDebugUtils.currentLine=12517423;
 //BA.debugLineNum = 12517423;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4a.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12517424;
 //BA.debugLineNum = 12517424;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12517425;
 //BA.debugLineNum = 12517425;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=12517426;
 //BA.debugLineNum = 12517426;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=12517427;
 //BA.debugLineNum = 12517427;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 8: {
RDebugUtils.currentLine=12517429;
 //BA.debugLineNum = 12517429;BA.debugLine="TwoLabelsLayout(\"lblDate\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblDate",_p,_prefitem);
 break; }
case 9: {
RDebugUtils.currentLine=12517431;
 //BA.debugLineNum = 12517431;BA.debugLine="TwoLabelsLayout(\"lblOptions\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblOptions",_p,_prefitem);
 break; }
case 10: {
RDebugUtils.currentLine=12517433;
 //BA.debugLineNum = 12517433;BA.debugLine="p.LoadLayout(\"shortoptions\")";
_p.LoadLayout("shortoptions",ba);
RDebugUtils.currentLine=12517434;
 //BA.debugLineNum = 12517434;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12517435;
 //BA.debugLineNum = 12517435;BA.debugLine="Dim original As List = PrefItem.Extra.Get(\"opti";
_original = new anywheresoftware.b4a.objects.collections.List();
_original = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=12517443;
 //BA.debugLineNum = 12517443;BA.debugLine="Dim spnr As Spinner = B4XComboBox1.cmbBox";
_spnr = new anywheresoftware.b4a.objects.SpinnerWrapper();
_spnr = __ref._b4xcombobox1 /*b4a.example.b4xcombobox*/ ._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ ;
RDebugUtils.currentLine=12517444;
 //BA.debugLineNum = 12517444;BA.debugLine="spnr.TextColor = TextColor";
_spnr.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12517445;
 //BA.debugLineNum = 12517445;BA.debugLine="spnr.DropdownBackgroundColor = Dialog.Backgroun";
_spnr.setDropdownBackgroundColor(__ref._dialog /*b4a.example.b4xdialog*/ ._backgroundcolor /*int*/ );
RDebugUtils.currentLine=12517446;
 //BA.debugLineNum = 12517446;BA.debugLine="SetBackgroundTintList(spnr, xui.Color_Gray, Tex";
__ref._setbackgroundtintlist /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_spnr.getObject())),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray,__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12517447;
 //BA.debugLineNum = 12517447;BA.debugLine="Dim options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12517448;
 //BA.debugLineNum = 12517448;BA.debugLine="options.Initialize";
_options.Initialize();
RDebugUtils.currentLine=12517449;
 //BA.debugLineNum = 12517449;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=12517450;
 //BA.debugLineNum = 12517450;BA.debugLine="For Each opt As String In original";
{
final anywheresoftware.b4a.BA.IterableList group56 = _original;
final int groupLen56 = group56.getSize()
;int index56 = 0;
;
for (; index56 < groupLen56;index56++){
_opt = BA.ObjectToString(group56.Get(index56));
RDebugUtils.currentLine=12517451;
 //BA.debugLineNum = 12517451;BA.debugLine="options.Add(cs.Initialize.Alignment(\"ALIGN_OPP";
_options.Add((Object)(_cs.Initialize().Alignment(BA.getEnumFromString(android.text.Layout.Alignment.class,"ALIGN_OPPOSITE")).Typeface(__c.Typeface.DEFAULT_BOLD).Append(BA.ObjectToCharSequence(_opt)).PopAll().getObject()));
 }
};
RDebugUtils.currentLine=12517453;
 //BA.debugLineNum = 12517453;BA.debugLine="B4XComboBox1.SetItems(options)";
__ref._b4xcombobox1 /*b4a.example.b4xcombobox*/ ._setitems /*String*/ (null,_options);
RDebugUtils.currentLine=12517457;
 //BA.debugLineNum = 12517457;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4a.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
 break; }
case 11: {
RDebugUtils.currentLine=12517459;
 //BA.debugLineNum = 12517459;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=12517460;
 //BA.debugLineNum = 12517460;BA.debugLine="p.LoadLayout(\"coloritem\")";
_p.LoadLayout("coloritem",ba);
RDebugUtils.currentLine=12517461;
 //BA.debugLineNum = 12517461;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4a.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12517462;
 //BA.debugLineNum = 12517462;BA.debugLine="tf.HintFont = DefaultHintFont";
_tf._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=12517463;
 //BA.debugLineNum = 12517463;BA.debugLine="tf.LargeLabelTextSize = DefaultHintLargeSize";
_tf._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=12517464;
 //BA.debugLineNum = 12517464;BA.debugLine="tf.HintText = PrefItem.Title";
_tf._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12517465;
 //BA.debugLineNum = 12517465;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
RDebugUtils.currentLine=12517467;
 //BA.debugLineNum = 12517467;BA.debugLine="Dim ed As EditText = tf.TextField";
_ed = new anywheresoftware.b4a.objects.EditTextWrapper();
_ed = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_tf._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=12517468;
 //BA.debugLineNum = 12517468;BA.debugLine="ed.InputType = Bit.Or(0x00000080, 0x00080000)";
_ed.setInputType(__c.Bit.Or(((int)0x00000080),((int)0x00080000)));
 break; }
case 12: {
RDebugUtils.currentLine=12517471;
 //BA.debugLineNum = 12517471;BA.debugLine="TwoLabelsLayout(\"lblExplanation\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblExplanation",_p,_prefitem);
 break; }
case 13: {
RDebugUtils.currentLine=12517473;
 //BA.debugLineNum = 12517473;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12517474;
 //BA.debugLineNum = 12517474;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=12517475;
 //BA.debugLineNum = 12517475;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=12517476;
 //BA.debugLineNum = 12517476;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=12517477;
 //BA.debugLineNum = 12517477;BA.debugLine="xlbl.TextColor = SeparatorTextColor";
_xlbl.setTextColor(__ref._separatortextcolor /*int*/ );
RDebugUtils.currentLine=12517478;
 //BA.debugLineNum = 12517478;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(14)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14)));
RDebugUtils.currentLine=12517479;
 //BA.debugLineNum = 12517479;BA.debugLine="xlbl.Color = SeparatorBackgroundColor";
_xlbl.setColor(__ref._separatorbackgroundcolor /*int*/ );
RDebugUtils.currentLine=12517480;
 //BA.debugLineNum = 12517480;BA.debugLine="p.Height = 30dip";
_p.setHeight(__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=12517481;
 //BA.debugLineNum = 12517481;BA.debugLine="p.AddView(xlbl, 0, 0, p.Width, p.Height)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=12517482;
 //BA.debugLineNum = 12517482;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(xlbl,";
__ref._dialog /*b4a.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_xlbl,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12517483;
 //BA.debugLineNum = 12517483;BA.debugLine="PrefItem.Required = False";
_prefitem.Required /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=12517485;
 //BA.debugLineNum = 12517485;BA.debugLine="If PrefItem.Required Then";
if (_prefitem.Required /*boolean*/ ) { 
RDebugUtils.currentLine=12517486;
 //BA.debugLineNum = 12517486;BA.debugLine="Dim rlbl As Label";
_rlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12517487;
 //BA.debugLineNum = 12517487;BA.debugLine="rlbl.Initialize(\"\")";
_rlbl.Initialize(ba,"");
RDebugUtils.currentLine=12517488;
 //BA.debugLineNum = 12517488;BA.debugLine="Dim xlbl As B4XView = rlbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rlbl.getObject()));
RDebugUtils.currentLine=12517489;
 //BA.debugLineNum = 12517489;BA.debugLine="xlbl.Text = \"*\"";
_xlbl.setText(BA.ObjectToCharSequence("*"));
RDebugUtils.currentLine=12517490;
 //BA.debugLineNum = 12517490;BA.debugLine="xlbl.TextColor = xui.Color_Red";
_xlbl.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=12517491;
 //BA.debugLineNum = 12517491;BA.debugLine="xlbl.TextSize = 11";
_xlbl.setTextSize((float) (11));
RDebugUtils.currentLine=12517492;
 //BA.debugLineNum = 12517492;BA.debugLine="xlbl.SetTextAlignment(\"TOP\", \"LEFT\")";
_xlbl.SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=12517493;
 //BA.debugLineNum = 12517493;BA.debugLine="p.AddView(xlbl, 01dip, 0dip, 10dip, 10dip)";
_p.AddView((android.view.View)(_xlbl.getObject()),__c.DipToCurrent((int) (01)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)));
 };
RDebugUtils.currentLine=12517495;
 //BA.debugLineNum = 12517495;BA.debugLine="p.Color = ItemsBackgroundColor";
_p.setColor(__ref._itemsbackgroundcolor /*int*/ );
RDebugUtils.currentLine=12517496;
 //BA.debugLineNum = 12517496;BA.debugLine="If mTheme <> THEME_DARK Then";
if (__ref._mtheme /*int*/ !=__ref._theme_dark /*int*/ ) { 
RDebugUtils.currentLine=12517497;
 //BA.debugLineNum = 12517497;BA.debugLine="If p.GetView(0).Tag Is B4XFloatTextField Then";
if (_p.GetView((int) (0)).getTag() instanceof b4a.example.b4xfloattextfield) { 
RDebugUtils.currentLine=12517498;
 //BA.debugLineNum = 12517498;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4a.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12517499;
 //BA.debugLineNum = 12517499;BA.debugLine="tf.TextField.TextColor = TextColor";
_tf._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12517500;
 //BA.debugLineNum = 12517500;BA.debugLine="tf.NonFocusedHintColor = TextColor";
_tf._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=12517501;
 //BA.debugLineNum = 12517501;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
RDebugUtils.currentLine=12517502;
 //BA.debugLineNum = 12517502;BA.debugLine="If tf.lblClear.IsInitialized Then tf.lblClear.T";
if (_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
RDebugUtils.currentLine=12517503;
 //BA.debugLineNum = 12517503;BA.debugLine="If tf.lblV.IsInitialized Then tf.lblV.TextColor";
if (_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
 };
 };
RDebugUtils.currentLine=12517506;
 //BA.debugLineNum = 12517506;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=12517507;
 //BA.debugLineNum = 12517507;BA.debugLine="End Sub";
return null;
}
public String  _createtimeitem(b4a.example.preferencesdialog __ref,b4a.example.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createtimeitem", true))
	 {return ((String) Debug.delegate(ba, "createtimeitem", new Object[] {_prefitem,_p}));}
boolean _is24 = false;
b4a.example.b4xplusminus _pmhours = null;
b4a.example.b4xplusminus _pmminutes = null;
b4a.example.b4xplusminus _pmampm = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub CreateTimeItem (PrefItem As B4XPrefIte";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Dim is24 As Boolean = PrefItem.Extra.GetDefault(\"";
_is24 = BA.ObjectToBoolean(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False)));
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="p.LoadLayout(\"timeitem24\")";
_p.LoadLayout("timeitem24",ba);
 }else {
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="p.LoadLayout(\"timeitem\")";
_p.LoadLayout("timeitem",ba);
 };
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="Dim pmHours As B4XPlusMinus = p.GetView(0).Tag";
_pmhours = (b4a.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="pmHours.RapidPeriod2 = 100";
_pmhours._rapidperiod2 /*int*/  = (int) (100);
RDebugUtils.currentLine=12648458;
 //BA.debugLineNum = 12648458;BA.debugLine="Dim pmMinutes As B4XPlusMinus = p.GetView(1).Tag";
_pmminutes = (b4a.example.b4xplusminus)(_p.GetView((int) (1)).getTag());
RDebugUtils.currentLine=12648459;
 //BA.debugLineNum = 12648459;BA.debugLine="Dim pmAMPM As B4XPlusMinus = p.GetView(2).Tag";
_pmampm = (b4a.example.b4xplusminus)(_p.GetView((int) (2)).getTag());
RDebugUtils.currentLine=12648460;
 //BA.debugLineNum = 12648460;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=12648461;
 //BA.debugLineNum = 12648461;BA.debugLine="Dim clr As Int = CustomListView1.sv.ScrollViewIn";
_clr = __ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.getScrollViewInnerPanel().getColor();
RDebugUtils.currentLine=12648462;
 //BA.debugLineNum = 12648462;BA.debugLine="pmHours.mBase.SetColorAndBorder(xui.Color_Transp";
_pmhours._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,(int) (0));
RDebugUtils.currentLine=12648463;
 //BA.debugLineNum = 12648463;BA.debugLine="pmMinutes.mBase.SetColorAndBorder(xui.Color_Tran";
_pmminutes._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,(int) (0));
RDebugUtils.currentLine=12648464;
 //BA.debugLineNum = 12648464;BA.debugLine="pmAMPM.mBase.SetColorAndBorder(xui.Color_Transpa";
_pmampm._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,(int) (0));
 };
RDebugUtils.currentLine=12648467;
 //BA.debugLineNum = 12648467;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=12648468;
 //BA.debugLineNum = 12648468;BA.debugLine="pmHours.SetNumericRange(0, 23, 1)";
_pmhours._setnumericrange /*String*/ (null,0,23,1);
 }else {
RDebugUtils.currentLine=12648470;
 //BA.debugLineNum = 12648470;BA.debugLine="pmHours.SetNumericRange(1, 12, 1)";
_pmhours._setnumericrange /*String*/ (null,1,12,1);
 };
RDebugUtils.currentLine=12648472;
 //BA.debugLineNum = 12648472;BA.debugLine="pmMinutes.SetNumericRange(0, 59, 1)";
_pmminutes._setnumericrange /*String*/ (null,0,59,1);
RDebugUtils.currentLine=12648473;
 //BA.debugLineNum = 12648473;BA.debugLine="pmMinutes.Formatter.GetDefaultFormat.MinimumInteg";
_pmminutes._formatter /*b4a.example.b4xformatter*/ ._getdefaultformat /*b4a.example.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = (int) (2);
RDebugUtils.currentLine=12648475;
 //BA.debugLineNum = 12648475;BA.debugLine="pmAMPM.SetStringItems(Array(\"am\", \"pm\"))";
_pmampm._setstringitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("am"),(Object)("pm")}));
RDebugUtils.currentLine=12648476;
 //BA.debugLineNum = 12648476;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4a.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (3)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12648477;
 //BA.debugLineNum = 12648477;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group27 = _p.GetAllViewsRecursive();
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group27.Get(index27)));
RDebugUtils.currentLine=12648478;
 //BA.debugLineNum = 12648478;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof android.widget.TextView) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=12648480;
 //BA.debugLineNum = 12648480;BA.debugLine="End Sub";
return "";
}
public String  _createnumericrangeitem(b4a.example.preferencesdialog __ref,b4a.example.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "createnumericrangeitem", new Object[] {_prefitem,_p}));}
b4a.example.b4xplusminus _pm = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Private Sub CreateNumericRangeItem (PrefItem As B4";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="p.LoadLayout(\"numericrange\")";
_p.LoadLayout("numericrange",ba);
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim pm As B4XPlusMinus = p.GetView(0).Tag";
_pm = (b4a.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="pm.SetNumericRange(PrefItem.Extra.Get(\"start\"), P";
_pm._setnumericrange /*String*/ (null,(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("start")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("end")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("interval")))));
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="pm.Formatter.GetDefaultFormat.MaximumFractions =";
_pm._formatter /*b4a.example.b4xformatter*/ ._getdefaultformat /*b4a.example.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = (int) (2);
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4a.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (1)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group6 = _p.GetAllViewsRecursive();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group6.Get(index6)));
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof android.widget.TextView) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="End Sub";
return "";
}
public String  _twolabelslayout(b4a.example.preferencesdialog __ref,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _p,b4a.example.preferencesdialog._b4xprefitem _prefitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "twolabelslayout", true))
	 {return ((String) Debug.delegate(ba, "twolabelslayout", new Object[] {_eventname,_p,_prefitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbldate = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub TwoLabelsLayout (EventName As String,";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim lblTitle As B4XView = CreateLabel(EventName)";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbltitle = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lbltitle.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="lblTitle.TextColor = TextColor";
_lbltitle.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultBoldFont(16";
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="lblTitle.Font = fnt";
_lbltitle.setFont(_fnt);
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(lblTitle";
__ref._dialog /*b4a.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_lbltitle,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="p.AddView(lblTitle, 10dip, 10dip, p.Width - 110di";
_p.AddView((android.view.View)(_lbltitle.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),(int) (_p.getWidth()-__c.DipToCurrent((int) (110))),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="Dim lblDate As B4XView = CreateLabel(EventName)";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbldate = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="lblDate.TextColor = TextColor";
_lbldate.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="lblDate.SetTextAlignment(\"CENTER\", \"RIGHT\")";
_lbldate.SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=12910603;
 //BA.debugLineNum = 12910603;BA.debugLine="lblDate.Font = fnt";
_lbldate.setFont(_fnt);
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="p.AddView(lblDate, p.Width - 108dip, 10dip, 98dip";
_p.AddView((android.view.View)(_lbldate.getObject()),(int) (_p.getWidth()-__c.DipToCurrent((int) (108))),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundtintlist(b4a.example.preferencesdialog __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setbackgroundtintlist", true))
	 {return ((String) Debug.delegate(ba, "setbackgroundtintlist", new Object[] {_view,_active,_enabled}));}
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Private Sub SetBackgroundTintList(View As View,Act";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("androidx.core.view.ViewCompat");
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4a.example.preferencesdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public String  _filldata(b4a.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "filldata", true))
	 {return ((String) Debug.delegate(ba, "filldata", new Object[] {_data}));}
int _i = 0;
b4a.example3.customlistview._clvitem _item = null;
b4a.example.preferencesdialog._b4xprefitem _prefitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _itempanel = null;
b4a.example.b4xswitch _switch = null;
b4a.example.b4xfloattextfield _ft = null;
b4a.example.b4xcombobox _cmb = null;
anywheresoftware.b4a.objects.collections.List _options = null;
b4a.example.b4xplusminus _pmhours = null;
b4a.example.b4xplusminus _pmminutes = null;
b4a.example.b4xplusminus _pmampm = null;
b4a.example.dateutils._period _p = null;
int _hour = 0;
String _m = "";
b4a.example.b4xplusminus _pm = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Private Sub FillData (Data As Map)";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4a.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4a.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_time /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_numericrange /*int*/ )) {
case 0: {
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4a.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="switch.Value = GetPrefItemValue(PrefItem, Fals";
_switch._setvalue /*boolean*/ (null,BA.ObjectToBoolean(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.False),_data)));
 break; }
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4a.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="ft.Text = GetPrefItemValue(PrefItem, \"\", Data)";
_ft._settext /*String*/ (null,BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 6: {
RDebugUtils.currentLine=12189710;
 //BA.debugLineNum = 12189710;BA.debugLine="ItemPanel.GetView(1).Text = DateTime.Date(GetP";
_itempanel.GetView((int) (1)).setText(BA.ObjectToCharSequence(__c.DateTime.Date(BA.ObjectToLongNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.DateTime.getNow()),_data)))));
 break; }
case 7: {
RDebugUtils.currentLine=12189712;
 //BA.debugLineNum = 12189712;BA.debugLine="ItemPanel.GetView(1).Text = GetPrefItemValue(P";
_itempanel.GetView((int) (1)).setText(BA.ObjectToCharSequence(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 8: {
RDebugUtils.currentLine=12189714;
 //BA.debugLineNum = 12189714;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4a.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=12189715;
 //BA.debugLineNum = 12189715;BA.debugLine="Dim options As List = PrefItem.Extra.Get(\"opti";
_options = new anywheresoftware.b4a.objects.collections.List();
_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=12189716;
 //BA.debugLineNum = 12189716;BA.debugLine="cmb.SelectedIndex = Max(0, options.IndexOf(Get";
_cmb._setselectedindex /*int*/ (null,(int) (__c.Max(0,_options.IndexOf(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)))));
 break; }
case 9: {
RDebugUtils.currentLine=12189718;
 //BA.debugLineNum = 12189718;BA.debugLine="SetLabelColor(ItemPanel.GetView(1), GetPrefIte";
__ref._setlabelcolor /*String*/ (null,_itempanel.GetView((int) (1)),(int)(BA.ObjectToNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),_data))));
RDebugUtils.currentLine=12189719;
 //BA.debugLineNum = 12189719;BA.debugLine="ItemPanel.GetView(2).Text = \"Pick\"";
_itempanel.GetView((int) (2)).setText(BA.ObjectToCharSequence("Pick"));
 break; }
case 10: {
RDebugUtils.currentLine=12189721;
 //BA.debugLineNum = 12189721;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12189722;
 //BA.debugLineNum = 12189722;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=12189723;
 //BA.debugLineNum = 12189723;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=12189724;
 //BA.debugLineNum = 12189724;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=12189725;
 //BA.debugLineNum = 12189725;BA.debugLine="p = GetPrefItemValue(PrefItem, p, Data)";
_p = (b4a.example.dateutils._period)(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(_p),_data));
RDebugUtils.currentLine=12189726;
 //BA.debugLineNum = 12189726;BA.debugLine="Dim hour As Int = p.Hours";
_hour = _p.Hours;
RDebugUtils.currentLine=12189727;
 //BA.debugLineNum = 12189727;BA.debugLine="Dim m As String";
_m = "";
RDebugUtils.currentLine=12189728;
 //BA.debugLineNum = 12189728;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=12189729;
 //BA.debugLineNum = 12189729;BA.debugLine="If hour <= 11 Then";
if (_hour<=11) { 
RDebugUtils.currentLine=12189730;
 //BA.debugLineNum = 12189730;BA.debugLine="m = \"am\"";
_m = "am";
 }else {
RDebugUtils.currentLine=12189732;
 //BA.debugLineNum = 12189732;BA.debugLine="m = \"pm\"";
_m = "pm";
RDebugUtils.currentLine=12189733;
 //BA.debugLineNum = 12189733;BA.debugLine="hour = hour - 12";
_hour = (int) (_hour-12);
 };
RDebugUtils.currentLine=12189735;
 //BA.debugLineNum = 12189735;BA.debugLine="If hour = 0 Then hour = 12";
if (_hour==0) { 
_hour = (int) (12);};
 };
RDebugUtils.currentLine=12189737;
 //BA.debugLineNum = 12189737;BA.debugLine="pmHours.SelectedValue = hour";
_pmhours._setselectedvalue /*Object*/ (null,(Object)(_hour));
RDebugUtils.currentLine=12189738;
 //BA.debugLineNum = 12189738;BA.debugLine="pmMinutes.SelectedValue = p.Minutes";
_pmminutes._setselectedvalue /*Object*/ (null,(Object)(_p.Minutes));
RDebugUtils.currentLine=12189739;
 //BA.debugLineNum = 12189739;BA.debugLine="pmAMPM.SelectedValue = m";
_pmampm._setselectedvalue /*Object*/ (null,(Object)(_m));
 break; }
case 11: 
case 12: {
 break; }
case 13: {
RDebugUtils.currentLine=12189742;
 //BA.debugLineNum = 12189742;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4a.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=12189743;
 //BA.debugLineNum = 12189743;BA.debugLine="pm.SelectedValue = GetPrefItemValue(PrefItem,";
_pm._setselectedvalue /*Object*/ (null,__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(0),_data));
 break; }
default: {
RDebugUtils.currentLine=12189745;
 //BA.debugLineNum = 12189745;BA.debugLine="Log(\"Unknown type: \" & PrefItem.ItemType)";
__c.LogImpl("912189745","Unknown type: "+BA.NumberToString(_prefitem.ItemType /*int*/ ),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=12189748;
 //BA.debugLineNum = 12189748;BA.debugLine="End Sub";
return "";
}
public Object  _getprefitemvalue(b4a.example.preferencesdialog __ref,b4a.example.preferencesdialog._b4xprefitem _prefitem,Object _defaultvalue,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitemvalue", true))
	 {return ((Object) Debug.delegate(ba, "getprefitemvalue", new Object[] {_prefitem,_defaultvalue,_data}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Private Sub GetPrefItemValue (PrefItem As B4XPrefI";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Return Data.GetDefault(PrefItem.Key, DefaultValue";
if (true) return _data.GetDefault((Object)(_prefitem.Key /*String*/ ),_defaultvalue);
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return null;
}
public String  _setlabelcolor(b4a.example.preferencesdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setlabelcolor", true))
	 {return ((String) Debug.delegate(ba, "setlabelcolor", new Object[] {_lbl,_clr}));}
b4a.example.b4xfloattextfield _ft = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub SetLabelColor(lbl As B4XView, clr As I";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Dim ft As B4XFloatTextField = lbl.Parent.GetView(";
_ft = (b4a.example.b4xfloattextfield)(_lbl.getParent().GetView((int) (0)).getTag());
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="ft.Text = ColorToHex(clr)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_clr));
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="lbl.SetColorAndBorder(clr, 1dip, Dialog.BorderCol";
_lbl.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._dialog /*b4a.example.b4xdialog*/ ._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.preferencesdialog __ref,b4a.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog1}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub GetPanel (Dialog1 As B4XDialog) As B4XV";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return null;
}
public b4a.example.preferencesdialog._b4xprefitem  _getprefitem(b4a.example.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitem", true))
	 {return ((b4a.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "getprefitem", new Object[] {_key}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub GetPrefItem (Key As String) As B4XPrefI";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4a.example.preferencesdialog._b4xprefitem)(group1.Get(index1));
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="If pi.Key = Key Then Return pi";
if ((_pi.Key /*String*/ ).equals(_key)) { 
if (true) return _pi;};
 }
};
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Return Null";
if (true) return (b4a.example.preferencesdialog._b4xprefitem)(__c.Null);
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="End Sub";
return null;
}
public int  _gettheme(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettheme", true))
	 {return ((Integer) Debug.delegate(ba, "gettheme", null));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub getTheme As Int";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Return mTheme";
if (true) return __ref._mtheme /*int*/ ;
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return 0;
}
public Object  _gettitle(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettitle", true))
	 {return ((Object) Debug.delegate(ba, "gettitle", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub getTitle As Object";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Return mTitle";
if (true) return __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="End Sub";
return null;
}
public int[]  _hextocolor(b4a.example.preferencesdialog __ref,String _hex) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "hextocolor", true))
	 {return ((int[]) Debug.delegate(ba, "hextocolor", new Object[] {_hex}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int[] _res = null;
int[] _ints = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Private Sub HexToColor(Hex As String) As Int()";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Hex = Hex.ToLowerCase";
_hex = _hex.toLowerCase();
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="If Hex.Length = 6 Then Hex = \"ff\" & Hex";
if (_hex.length()==6) { 
_hex = "ff"+_hex;};
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="Dim res() As Int";
_res = new int[(int) (0)];
;
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="If Regex.IsMatch(\"[0-9a-f]{8}\", Hex) = False Then";
if (__c.Regex.IsMatch("[0-9a-f]{8}",_hex)==__c.False) { 
if (true) return _res;};
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="Return ints";
if (true) return _ints;
RDebugUtils.currentLine=13893646;
 //BA.debugLineNum = 13893646;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.preferencesdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _title,int _width,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent,_title,_width,_height}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub Initialize (Parent As B4XView, Title As";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Dialog.Initialize(Parent)";
__ref._dialog /*b4a.example.b4xdialog*/ ._initialize /*String*/ (null,ba,_parent);
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Dialog.VisibleAnimationDuration = 0";
__ref._dialog /*b4a.example.b4xdialog*/ ._visibleanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="mTitle = Title";
__ref._mtitle /*Object*/  = _title;
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="CustomListView1.PressedColor = xui.Color_Transpar";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._pressedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="PrefItems.Initialize";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="SearchTemplate.Initialize";
__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="LongTextTemplate.Initialize";
__ref._longtexttemplate /*b4a.example.b4xlongtexttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="LongTextTemplate.CustomListView1.PressedColor = 0";
__ref._longtexttemplate /*b4a.example.b4xlongtexttemplate*/ ._customlistview1 /*b4a.example3.customlistview*/ ._pressedcolor = (int) (0);
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="Dialog.OverlayColor = xui.Color_Transparent";
__ref._dialog /*b4a.example.b4xdialog*/ ._overlaycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="DefaultHintFont = xui.CreateDefaultBoldFont(16)";
__ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=10420250;
 //BA.debugLineNum = 10420250;BA.debugLine="DefaultHintLargeSize = 16";
__ref._defaulthintlargesize /*int*/  = (int) (16);
RDebugUtils.currentLine=10420251;
 //BA.debugLineNum = 10420251;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
RDebugUtils.currentLine=10420253;
 //BA.debugLineNum = 10420253;BA.debugLine="End Sub";
return "";
}
public String  _settheme(b4a.example.preferencesdialog __ref,int _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settheme", true))
	 {return ((String) Debug.delegate(ba, "settheme", new Object[] {_t}));}
int _dividercolor = 0;
b4a.example3.customlistview _clv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub setTheme (t As Int)";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="If t <> mTheme Then";
if (_t!=__ref._mtheme /*int*/ ) { 
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="mTheme = t";
__ref._mtheme /*int*/  = _t;
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="Dim DividerColor As Int";
_dividercolor = 0;
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="Select mTheme";
switch (BA.switchObjectToInt(__ref._mtheme /*int*/ ,__ref._theme_dark /*int*/ ,__ref._theme_light /*int*/ )) {
case 0: {
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="ItemsBackgroundColor = 0xFF626262";
__ref._itemsbackgroundcolor /*int*/  = ((int)0xff626262);
RDebugUtils.currentLine=12451848;
 //BA.debugLineNum = 12451848;BA.debugLine="SeparatorBackgroundColor = 0xFFC0C0C0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffc0c0c0);
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="SeparatorTextColor = xui.Color_Black";
__ref._separatortextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="TextColor = xui.Color_White";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=12451851;
 //BA.debugLineNum = 12451851;BA.debugLine="DividerColor = 0xFF464646";
_dividercolor = ((int)0xff464646);
RDebugUtils.currentLine=12451852;
 //BA.debugLineNum = 12451852;BA.debugLine="Dialog.BackgroundColor = 0xFF555555";
__ref._dialog /*b4a.example.b4xdialog*/ ._backgroundcolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=12451853;
 //BA.debugLineNum = 12451853;BA.debugLine="Dialog.ButtonsColor = 0xFF555555";
__ref._dialog /*b4a.example.b4xdialog*/ ._buttonscolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=12451854;
 //BA.debugLineNum = 12451854;BA.debugLine="Dialog.BorderColor = 0xff000000";
__ref._dialog /*b4a.example.b4xdialog*/ ._bordercolor /*int*/  = ((int)0xff000000);
RDebugUtils.currentLine=12451855;
 //BA.debugLineNum = 12451855;BA.debugLine="Dialog.ButtonsTextColor = 0xFF89D5FF";
__ref._dialog /*b4a.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=12451856;
 //BA.debugLineNum = 12451856;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Gray";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=12451857;
 //BA.debugLineNum = 12451857;BA.debugLine="DateTemplate.SelectedColor = 0xFF0BA29B";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff0ba29b);
 break; }
case 1: {
RDebugUtils.currentLine=12451859;
 //BA.debugLineNum = 12451859;BA.debugLine="ItemsBackgroundColor = xui.Color_White";
__ref._itemsbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=12451860;
 //BA.debugLineNum = 12451860;BA.debugLine="SeparatorBackgroundColor = 0xFFD0D0D0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffd0d0d0);
RDebugUtils.currentLine=12451861;
 //BA.debugLineNum = 12451861;BA.debugLine="SeparatorTextColor = 0xFF4E4F50";
__ref._separatortextcolor /*int*/  = ((int)0xff4e4f50);
RDebugUtils.currentLine=12451862;
 //BA.debugLineNum = 12451862;BA.debugLine="TextColor = 0xFF5B5B5B";
__ref._textcolor /*int*/  = ((int)0xff5b5b5b);
RDebugUtils.currentLine=12451863;
 //BA.debugLineNum = 12451863;BA.debugLine="DividerColor = 0xFFDFDFDF";
_dividercolor = ((int)0xffdfdfdf);
RDebugUtils.currentLine=12451864;
 //BA.debugLineNum = 12451864;BA.debugLine="Dialog.BackgroundColor = xui.Color_White";
__ref._dialog /*b4a.example.b4xdialog*/ ._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=12451865;
 //BA.debugLineNum = 12451865;BA.debugLine="Dialog.ButtonsColor = xui.Color_White";
__ref._dialog /*b4a.example.b4xdialog*/ ._buttonscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=12451866;
 //BA.debugLineNum = 12451866;BA.debugLine="Dialog.BorderColor = xui.Color_Gray";
__ref._dialog /*b4a.example.b4xdialog*/ ._bordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=12451867;
 //BA.debugLineNum = 12451867;BA.debugLine="Dialog.ButtonsTextColor = 0xFF007DC3";
__ref._dialog /*b4a.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff007dc3);
RDebugUtils.currentLine=12451868;
 //BA.debugLineNum = 12451868;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Black";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=12451869;
 //BA.debugLineNum = 12451869;BA.debugLine="DateTemplate.SelectedColor = 0xFF39D7CE";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff39d7ce);
 break; }
}
;
RDebugUtils.currentLine=12451872;
 //BA.debugLineNum = 12451872;BA.debugLine="SearchTemplate.SearchField.TextField.TextColor =";
__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._searchfield /*b4a.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12451873;
 //BA.debugLineNum = 12451873;BA.debugLine="SearchTemplate.SearchField.NonFocusedHintColor =";
__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._searchfield /*b4a.example.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=12451874;
 //BA.debugLineNum = 12451874;BA.debugLine="Dialog.BorderCornersRadius = 0";
__ref._dialog /*b4a.example.b4xdialog*/ ._bordercornersradius /*int*/  = (int) (0);
RDebugUtils.currentLine=12451875;
 //BA.debugLineNum = 12451875;BA.debugLine="Dialog.BorderWidth = 1dip";
__ref._dialog /*b4a.example.b4xdialog*/ ._borderwidth /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=12451876;
 //BA.debugLineNum = 12451876;BA.debugLine="DateTemplate.HighlightedColor = 0xFF00CEFF";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._highlightedcolor /*int*/  = ((int)0xff00ceff);
RDebugUtils.currentLine=12451877;
 //BA.debugLineNum = 12451877;BA.debugLine="DateTemplate.DaysInMonthColor = TextColor";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._daysinmonthcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=12451878;
 //BA.debugLineNum = 12451878;BA.debugLine="DateTemplate.lblMonth.TextColor = TextColor";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12451879;
 //BA.debugLineNum = 12451879;BA.debugLine="DateTemplate.lblYear.TextColor = TextColor";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=12451880;
 //BA.debugLineNum = 12451880;BA.debugLine="For Each clv As CustomListView In Array(CustomLi";
{
final Object[] group39 = new Object[]{(Object)(__ref._customlistview1 /*b4a.example3.customlistview*/ ),(Object)(__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._customlistview1 /*b4a.example3.customlistview*/ ),(Object)(__ref._longtexttemplate /*b4a.example.b4xlongtexttemplate*/ ._customlistview1 /*b4a.example3.customlistview*/ )};
final int groupLen39 = group39.length
;int index39 = 0;
;
for (; index39 < groupLen39;index39++){
_clv = (b4a.example3.customlistview)(group39[index39]);
RDebugUtils.currentLine=12451881;
 //BA.debugLineNum = 12451881;BA.debugLine="clv.sv.ScrollViewInnerPanel.Color = DividerColo";
_clv._sv.getScrollViewInnerPanel().setColor(_dividercolor);
RDebugUtils.currentLine=12451882;
 //BA.debugLineNum = 12451882;BA.debugLine="clv.sv.Color = Dialog.BackgroundColor";
_clv._sv.setColor(__ref._dialog /*b4a.example.b4xdialog*/ ._backgroundcolor /*int*/ );
RDebugUtils.currentLine=12451883;
 //BA.debugLineNum = 12451883;BA.debugLine="clv.DefaultTextBackgroundColor = ItemsBackgroun";
_clv._defaulttextbackgroundcolor = __ref._itemsbackgroundcolor /*int*/ ;
RDebugUtils.currentLine=12451884;
 //BA.debugLineNum = 12451884;BA.debugLine="clv.DefaultTextColor = TextColor";
_clv._defaulttextcolor = __ref._textcolor /*int*/ ;
 }
};
RDebugUtils.currentLine=12451892;
 //BA.debugLineNum = 12451892;BA.debugLine="For Each b As B4XView In Array(DateTemplate.btnM";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group45 = new Object[]{(Object)(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen45 = group45.length
;int index45 = 0;
;
for (; index45 < groupLen45;index45++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group45[index45]));
RDebugUtils.currentLine=12451893;
 //BA.debugLineNum = 12451893;BA.debugLine="b.Color = xui.Color_Transparent";
_b.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=12451894;
 //BA.debugLineNum = 12451894;BA.debugLine="b.TextColor = TextColor";
_b.setTextColor(__ref._textcolor /*int*/ );
 }
};
 };
RDebugUtils.currentLine=12451901;
 //BA.debugLineNum = 12451901;BA.debugLine="End Sub";
return "";
}
public String  _keyboardheightchanged(b4a.example.preferencesdialog __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "keyboardheightchanged", true))
	 {return ((String) Debug.delegate(ba, "keyboardheightchanged", new Object[] {_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.example.b4xfloattextfield _f = null;
int _index = 0;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub KeyboardHeightChanged (Height As Int)";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4a.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="CustomListView1.sv.Height = Min(CustomListView1.A";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setHeight((int) (__c.Min(__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().getHeight(),_height-__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().getParent().getTop()-__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().getParent().getParent().getTop())));
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="For Each v As B4XView In CustomListView1.AsView.";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="If v.Tag Is B4XFloatTextField Then";
if (_v.getTag() instanceof b4a.example.b4xfloattextfield) { 
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="Dim f As B4XFloatTextField = v.Tag";
_f = (b4a.example.b4xfloattextfield)(_v.getTag());
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="If f.Focused Then";
if (_f._focused /*boolean*/ ) { 
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="Dim index As Int = CustomListView1.GetItemFro";
_index = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getitemfromview(_f._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="CustomListView1.ScrollToItem(index)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._scrolltoitem(_index);
 };
 };
 }
};
 };
RDebugUtils.currentLine=10682390;
 //BA.debugLineNum = 10682390;BA.debugLine="End Sub";
return "";
}
public String  _lblcolors_click(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblcolors_click", true))
	 {return ((String) Debug.delegate(ba, "lblcolors_click", null));}
b4a.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub lblColors_Click";
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4a.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4a.example3.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4a.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="ColorTemplate.SelectedColor = CustomListView1.Get";
__ref._colortemplate /*b4a.example.b4xcolortemplate*/ ._setselectedcolor /*int*/ (null,__ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getColor());
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="Template = ColorTemplate";
__ref._template /*Object*/  = (Object)(__ref._colortemplate /*b4a.example.b4xcolortemplate*/ );
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="End Sub";
return "";
}
public String  _lbldate_click(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbldate_click", true))
	 {return ((String) Debug.delegate(ba, "lbldate_click", null));}
b4a.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Private Sub lblDate_Click";
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4a.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4a.example3.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4a.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="DateTemplate.Date = DateTime.DateParse(CustomList";
__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._setdate /*long*/ (null,__c.DateTime.DateParse(__ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText()));
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="Template = DateTemplate";
__ref._template /*Object*/  = (Object)(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ );
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="End Sub";
return "";
}
public String  _lblexplanation_click(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblexplanation_click", true))
	 {return ((String) Debug.delegate(ba, "lblexplanation_click", null));}
b4a.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub lblExplanation_Click";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4a.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4a.example3.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4a.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="LongTextTemplate.Text = pref.Extra.Get(\"text\")";
__ref._longtexttemplate /*b4a.example.b4xlongtexttemplate*/ ._text /*Object*/  = _pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("text"));
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="Template = LongTextTemplate";
__ref._template /*Object*/  = (Object)(__ref._longtexttemplate /*b4a.example.b4xlongtexttemplate*/ );
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="End Sub";
return "";
}
public String  _lbloptions_click(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbloptions_click", true))
	 {return ((String) Debug.delegate(ba, "lbloptions_click", null));}
b4a.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Private Sub lblOptions_Click";
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4a.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4a.example3.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4a.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="If pref.Extra.ContainsKey(\"index\") Then";
if (_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("index"))) { 
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="SearchTemplate.SetIndex(pref.Extra.Get(\"index\"))";
__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._setindex /*String*/ (null,_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("index")));
 }else {
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="pref.Extra.Put(\"index\", SearchTemplate.SetItems(";
_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("index"),__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._setitems /*Object*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))))));
 };
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="SearchTemplate.SelectedItem = CustomListView1.Get";
__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._selecteditem /*String*/  = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText();
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="Template = SearchTemplate";
__ref._template /*Object*/  = (Object)(__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ );
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="End Sub";
return "";
}
public String  _loadfromjson(b4a.example.preferencesdialog __ref,String _json) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "loadfromjson", true))
	 {return ((String) Debug.delegate(ba, "loadfromjson", new Object[] {_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _p = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _theme = "";
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _key = "";
String _title = "";
boolean _required = false;
String _itemtype = "";
anywheresoftware.b4a.objects.collections.List _l = null;
b4a.example.preferencesdialog._b4xprefitem _pi = null;
String _text = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub LoadFromJson (Json As String)";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Dim p As JSONParser";
_p = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="p.Initialize(Json)";
_p.Initialize(_json);
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="Dim m As Map = p.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _p.NextObject();
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Dim theme As String = m.GetDefault(\"Theme\", \"Dark";
_theme = BA.ObjectToString(_m.GetDefault((Object)("Theme"),(Object)("Dark Theme")));
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Select theme";
switch (BA.switchObjectToInt(_theme,"Dark Theme","Light Theme")) {
case 0: {
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="setTheme(THEME_LIGHT)";
__ref._settheme /*String*/ (null,__ref._theme_light /*int*/ );
 break; }
}
;
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="Dim items As List = m.Get(\"Items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="For Each item As Map In items";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group12 = _items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group12.Get(index12)));
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="Dim key As String = item.Get(\"key\")";
_key = BA.ObjectToString(_item.Get((Object)("key")));
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="Dim title As String = item.Get(\"title\")";
_title = BA.ObjectToString(_item.Get((Object)("title")));
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="Dim required As Boolean = item.Get(\"required\")";
_required = BA.ObjectToBoolean(_item.Get((Object)("required")));
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="Dim itemType As String = item.Get(\"type\")";
_itemtype = BA.ObjectToString(_item.Get((Object)("type")));
RDebugUtils.currentLine=10813457;
 //BA.debugLineNum = 10813457;BA.debugLine="Select itemType";
switch (BA.switchObjectToInt(_itemtype,"Separator","Boolean","Text","Date","Short Options","Color","Number","Password","Options","Decimal Number","Multiline Text","Time","Numeric Range","Explanation")) {
case 0: {
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="AddSeparator(title)";
__ref._addseparator /*String*/ (null,(Object)(_title));
 break; }
case 1: {
RDebugUtils.currentLine=10813461;
 //BA.debugLineNum = 10813461;BA.debugLine="AddBooleanItem(key, title)";
__ref._addbooleanitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 2: {
RDebugUtils.currentLine=10813463;
 //BA.debugLineNum = 10813463;BA.debugLine="AddTextItem(key, title)";
__ref._addtextitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 3: {
RDebugUtils.currentLine=10813465;
 //BA.debugLineNum = 10813465;BA.debugLine="AddDateItem(key, title)";
__ref._adddateitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 4: {
RDebugUtils.currentLine=10813467;
 //BA.debugLineNum = 10813467;BA.debugLine="AddShortOptionsItem(key, title, item.Get(\"opti";
__ref._addshortoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 5: {
RDebugUtils.currentLine=10813469;
 //BA.debugLineNum = 10813469;BA.debugLine="AddColorItem(key, title)";
__ref._addcoloritem /*String*/ (null,_key,(Object)(_title));
 break; }
case 6: {
RDebugUtils.currentLine=10813471;
 //BA.debugLineNum = 10813471;BA.debugLine="AddNumberItem(key, title)";
__ref._addnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 7: {
RDebugUtils.currentLine=10813473;
 //BA.debugLineNum = 10813473;BA.debugLine="AddPasswordItem(key, title)";
__ref._addpassworditem /*String*/ (null,_key,(Object)(_title));
 break; }
case 8: {
RDebugUtils.currentLine=10813475;
 //BA.debugLineNum = 10813475;BA.debugLine="AddOptionsItem(key, title, item.Get(\"options\")";
__ref._addoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 9: {
RDebugUtils.currentLine=10813477;
 //BA.debugLineNum = 10813477;BA.debugLine="AddDecimalNumberItem(key, title)";
__ref._adddecimalnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 10: {
RDebugUtils.currentLine=10813479;
 //BA.debugLineNum = 10813479;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=10813480;
 //BA.debugLineNum = 10813480;BA.debugLine="If l.IsInitialized = False Or l.Size = 0 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()==0 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False) { 
RDebugUtils.currentLine=10813481;
 //BA.debugLineNum = 10813481;BA.debugLine="AddMultilineTextItem(key, title, 100dip)";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int) (100)));
 }else {
RDebugUtils.currentLine=10813483;
 //BA.debugLineNum = 10813483;BA.debugLine="AddMultilineTextItem(key, title, DipToCurrent";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int)(BA.ObjectToNumber(_l.Get((int) (0))))));
 };
 break; }
case 11: {
RDebugUtils.currentLine=10813486;
 //BA.debugLineNum = 10813486;BA.debugLine="AddTimeItem(key, title)";
__ref._addtimeitem /*String*/ (null,_key,(Object)(_title));
RDebugUtils.currentLine=10813487;
 //BA.debugLineNum = 10813487;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=10813488;
 //BA.debugLineNum = 10813488;BA.debugLine="If l.IsInitialized And l.Size > 0 Then";
if (_l.IsInitialized() && _l.getSize()>0) { 
RDebugUtils.currentLine=10813489;
 //BA.debugLineNum = 10813489;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefIte";
_pi = (b4a.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=10813490;
 //BA.debugLineNum = 10813490;BA.debugLine="pi.Extra.Put(\"24\", l.Get(0) = \"24\")";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("24"),(Object)((_l.Get((int) (0))).equals((Object)("24"))));
 };
 break; }
case 12: {
RDebugUtils.currentLine=10813494;
 //BA.debugLineNum = 10813494;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=10813495;
 //BA.debugLineNum = 10813495;BA.debugLine="If l.IsInitialized = False Or l.Size < 3 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()<3 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (1))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (2))))==__c.False) { 
RDebugUtils.currentLine=10813496;
 //BA.debugLineNum = 10813496;BA.debugLine="AddNumericRangeItem(key, title, 0, 100, 1)";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),0,100,1);
 }else {
RDebugUtils.currentLine=10813498;
 //BA.debugLineNum = 10813498;BA.debugLine="AddNumericRangeItem(key, title, l.Get(0), l.G";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),(double)(BA.ObjectToNumber(_l.Get((int) (0)))),(double)(BA.ObjectToNumber(_l.Get((int) (1)))),(double)(BA.ObjectToNumber(_l.Get((int) (2)))));
 };
 break; }
case 13: {
RDebugUtils.currentLine=10813501;
 //BA.debugLineNum = 10813501;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=10813502;
 //BA.debugLineNum = 10813502;BA.debugLine="Dim text As String";
_text = "";
RDebugUtils.currentLine=10813503;
 //BA.debugLineNum = 10813503;BA.debugLine="If l.IsInitialized Then";
if (_l.IsInitialized()) { 
RDebugUtils.currentLine=10813504;
 //BA.debugLineNum = 10813504;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10813505;
 //BA.debugLineNum = 10813505;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10813506;
 //BA.debugLineNum = 10813506;BA.debugLine="For i = 0 To l.Size - 1";
{
final int step65 = 1;
final int limit65 = (int) (_l.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit65 ;_i = _i + step65 ) {
RDebugUtils.currentLine=10813507;
 //BA.debugLineNum = 10813507;BA.debugLine="If i > 0 Then sb.Append(CRLF)";
if (_i>0) { 
_sb.Append(__c.CRLF);};
RDebugUtils.currentLine=10813508;
 //BA.debugLineNum = 10813508;BA.debugLine="sb.Append(l.Get(i))";
_sb.Append(BA.ObjectToString(_l.Get(_i)));
 }
};
RDebugUtils.currentLine=10813510;
 //BA.debugLineNum = 10813510;BA.debugLine="text = sb.ToString";
_text = _sb.ToString();
 };
RDebugUtils.currentLine=10813512;
 //BA.debugLineNum = 10813512;BA.debugLine="AddExplanationItem(key, title, text)";
__ref._addexplanationitem /*String*/ (null,_key,(Object)(_title),(Object)(_text));
 break; }
}
;
RDebugUtils.currentLine=10813514;
 //BA.debugLineNum = 10813514;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefItems.";
_pi = (b4a.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=10813515;
 //BA.debugLineNum = 10813515;BA.debugLine="pi.Required = required";
_pi.Required /*boolean*/  = _required;
 }
};
RDebugUtils.currentLine=10813517;
 //BA.debugLineNum = 10813517;BA.debugLine="End Sub";
return "";
}
public String  _raisebeforedialogdisplayed(b4a.example.preferencesdialog __ref,Object _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "raisebeforedialogdisplayed", true))
	 {return ((String) Debug.delegate(ba, "raisebeforedialogdisplayed", new Object[] {_temp}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub RaiseBeforeDialogDisplayed (Temp As Ob";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="If mEventName <> \"\" And  xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",(int) (1))) { 
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="CallSub2(mCallback, mEventName & \"_BeforeDialogD";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",_temp);
 };
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoitemwitherror(b4a.example.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "scrolltoitemwitherror", true))
	 {return ((String) Debug.delegate(ba, "scrolltoitemwitherror", new Object[] {_key}));}
int _i = 0;
b4a.example3.customlistview._clvitem _item = null;
b4a.example.preferencesdialog._b4xprefitem _prefitem = null;
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub ScrollToItemWithError (key As String)";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4a.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="If PrefItem.Key = key Then";
if ((_prefitem.Key /*String*/ ).equals(_key)) { 
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="End Sub";
return "";
}
public String  _seteventslistener(b4a.example.preferencesdialog __ref,Object _callback,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "seteventslistener", true))
	 {return ((String) Debug.delegate(ba, "seteventslistener", new Object[] {_callback,_eventname}));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="End Sub";
return "";
}
public String  _setexplanation(b4a.example.preferencesdialog __ref,String _key,Object _explanation) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setexplanation", true))
	 {return ((String) Debug.delegate(ba, "setexplanation", new Object[] {_key,_explanation}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub SetExplanation (Key As String, Explanat";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="GetPrefItem(Key).Extra.Put(\"text\", Explanation)";
__ref._getprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_key).Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("text"),_explanation);
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return "";
}
public String  _setoptions(b4a.example.preferencesdialog __ref,String _key,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_key,_options}));}
b4a.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub SetOptions (Key As String, Options As L";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim pi As B4XPrefItem = GetPrefItem(Key)";
_pi = __ref._getprefitem /*b4a.example.preferencesdialog._b4xprefitem*/ (null,_key);
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="If pi.Extra.IsInitialized = False Then";
if (_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="pi.Extra.Initialize";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="pi.Extra.Put(\"options\", Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("options"),(Object)(_options.getObject()));
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="End Sub";
return "";
}
public String  _settitle(b4a.example.preferencesdialog __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_o}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub setTitle(o As Object)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="mTitle = o";
__ref._mtitle /*Object*/  = _o;
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="End Sub";
return "";
}
public String  _show(b4a.example.preferencesdialog __ref,b4a.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog1}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Private Sub Show (Dialog1 As B4XDialog) 'ignore";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showdialog(b4a.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data,Object _yes,Object _cancel) throws Exception{
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "showdialog", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showdialog", new Object[] {_data,_yes,_cancel}));}
ResumableSub_ShowDialog rsub = new ResumableSub_ShowDialog(this,__ref,_data,_yes,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowDialog extends BA.ResumableSub {
public ResumableSub_ShowDialog(b4a.example.preferencesdialog parent,b4a.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data,Object _yes,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
this._yes = _yes;
this._cancel = _cancel;
this.__ref = parent;
}
b4a.example.preferencesdialog __ref;
b4a.example.preferencesdialog parent;
anywheresoftware.b4a.objects.collections.Map _data;
Object _yes;
Object _cancel;
b4a.example.b4xfloattextfield _lasttextfield = null;
b4a.example.preferencesdialog._b4xprefitem _pi = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4a.example.b4xfloattextfield _tf = null;
int _scrollviewoffset = 0;
Object _rs = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
int _result = 0;
Object _y = null;
Object _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
String _value = "";
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preferencesdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="If CustomListView1.Size = 0 Then";
if (true) break;

case 1:
//if
this.state = 21;
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Dim LastTextField As B4XFloatTextField";
_lasttextfield = new b4a.example.b4xfloattextfield();
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
if (true) break;

case 4:
//for
this.state = 15;
group3 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 64;
if (true) break;

case 64:
//C
this.state = 15;
if (index3 < groupLen3) {
this.state = 6;
_pi = (b4a.example.preferencesdialog._b4xprefitem)(group3.Get(index3));}
if (true) break;

case 65:
//C
this.state = 64;
index3++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Dim pnl As B4XView = CreateLayouts(pi)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createlayouts /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_pi);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="CustomListView1.Add (pnl, pi)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._add(_pnl,(Object)(_pi));
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="If pnl.GetView(0).Tag Is B4XFloatTextField Then";
if (true) break;

case 7:
//if
this.state = 14;
if (_pnl.GetView((int) (0)).getTag() instanceof b4a.example.b4xfloattextfield) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Dim tf As B4XFloatTextField = pnl.GetView(0).T";
_tf = (b4a.example.b4xfloattextfield)(_pnl.GetView((int) (0)).getTag());
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="If LastTextField.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_lasttextfield.IsInitialized /*boolean*/ ()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="LastTextField.NextField = tf";
_lasttextfield._setnextfield /*b4a.example.b4xfloattextfield*/ (null,_tf);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="LastTextField = tf";
_lasttextfield = _tf;
 if (true) break;

case 14:
//C
this.state = 65;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=11862032;
 //BA.debugLineNum = 11862032;BA.debugLine="If LastTextField.IsInitialized Then LastTextFiel";

case 15:
//if
this.state = 20;
if (_lasttextfield.IsInitialized /*boolean*/ ()) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
_lasttextfield._setnextfield /*b4a.example.b4xfloattextfield*/ (null,_lasttextfield);
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=11862035;
 //BA.debugLineNum = 11862035;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVi";
__ref._dialog /*b4a.example.b4xdialog*/ ._internaladdstubtoclvifneeded /*String*/ (null,__ref._customlistview1 /*b4a.example3.customlistview*/ ,__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=11862037;
 //BA.debugLineNum = 11862037;BA.debugLine="FillData (Data)";
__ref._filldata /*String*/ (null,_data);
RDebugUtils.currentLine=11862038;
 //BA.debugLineNum = 11862038;BA.debugLine="Dim ScrollViewOffset As Int 'ignore";
_scrollviewoffset = 0;
RDebugUtils.currentLine=11862039;
 //BA.debugLineNum = 11862039;BA.debugLine="Do While True";
if (true) break;

case 22:
//do while
this.state = 63;
while (parent.__c.True) {
this.state = 24;
if (true) break;
}
if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=11862040;
 //BA.debugLineNum = 11862040;BA.debugLine="Dialog.Title = mTitle";
__ref._dialog /*b4a.example.b4xdialog*/ ._title /*Object*/  = __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=11862041;
 //BA.debugLineNum = 11862041;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4a.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=11862042;
 //BA.debugLineNum = 11862042;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Me, Yes,";
_rs = __ref._dialog /*b4a.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent,_yes,(Object)(""),_cancel);
RDebugUtils.currentLine=11862044;
 //BA.debugLineNum = 11862044;BA.debugLine="If ScrollViewOffset > 0 Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_scrollviewoffset>0) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=11862045;
 //BA.debugLineNum = 11862045;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"),(int) (50));
this.state = 66;
return;
case 66:
//C
this.state = 28;
;
RDebugUtils.currentLine=11862046;
 //BA.debugLineNum = 11862046;BA.debugLine="Dim sv As ScrollView = CustomListView1.sv";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_sv = (anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=11862047;
 //BA.debugLineNum = 11862047;BA.debugLine="sv.ScrollToNow(ScrollViewOffset)";
_sv.ScrollToNow(_scrollviewoffset);
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=11862050;
 //BA.debugLineNum = 11862050;BA.debugLine="RaiseBeforeDialogDisplayed(Me)";
__ref._raisebeforedialogdisplayed /*String*/ (null,parent);
RDebugUtils.currentLine=11862051;
 //BA.debugLineNum = 11862051;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 67;
return;
case 67:
//C
this.state = 29;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=11862052;
 //BA.debugLineNum = 11862052;BA.debugLine="ScrollViewOffset = CustomListView1.sv.ScrollView";
_scrollviewoffset = __ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY();
RDebugUtils.currentLine=11862053;
 //BA.debugLineNum = 11862053;BA.debugLine="If Result <> RESULT_SHOWING_NESTED_DIALOG Then";
if (true) break;

case 29:
//if
this.state = 62;
if (_result!=__ref._result_showing_nested_dialog /*int*/ ) { 
this.state = 31;
}else {
this.state = 41;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=11862054;
 //BA.debugLineNum = 11862054;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 32:
//if
this.state = 39;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=11862055;
 //BA.debugLineNum = 11862055;BA.debugLine="If CommitChanges(Data) = False Then";
if (true) break;

case 35:
//if
this.state = 38;
if (__ref._commitchanges /*boolean*/ (null,_data)==parent.__c.False) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=11862056;
 //BA.debugLineNum = 11862056;BA.debugLine="ScrollViewOffset = 0";
_scrollviewoffset = (int) (0);
RDebugUtils.currentLine=11862057;
 //BA.debugLineNum = 11862057;BA.debugLine="Continue";
this.state = 22;
if (true) break;;
 if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = 62;
;
RDebugUtils.currentLine=11862060;
 //BA.debugLineNum = 11862060;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=11862062;
 //BA.debugLineNum = 11862062;BA.debugLine="Dim y As Object";
_y = new Object();
RDebugUtils.currentLine=11862063;
 //BA.debugLineNum = 11862063;BA.debugLine="Dim c As Object = Cancel";
_c = _cancel;
RDebugUtils.currentLine=11862064;
 //BA.debugLineNum = 11862064;BA.debugLine="If Template = ColorTemplate Then";
if (true) break;

case 42:
//if
this.state = 49;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4a.example.b4xcolortemplate*/ ))) { 
this.state = 44;
}else 
{RDebugUtils.currentLine=11862066;
 //BA.debugLineNum = 11862066;BA.debugLine="Else If Template = LongTextTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._longtexttemplate /*b4a.example.b4xlongtexttemplate*/ ))) { 
this.state = 46;
}else {
this.state = 48;
}}
if (true) break;

case 44:
//C
this.state = 49;
RDebugUtils.currentLine=11862065;
 //BA.debugLineNum = 11862065;BA.debugLine="y = Yes";
_y = _yes;
 if (true) break;

case 46:
//C
this.state = 49;
RDebugUtils.currentLine=11862067;
 //BA.debugLineNum = 11862067;BA.debugLine="y = Yes";
_y = _yes;
RDebugUtils.currentLine=11862068;
 //BA.debugLineNum = 11862068;BA.debugLine="c = \"\"";
_c = (Object)("");
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=11862070;
 //BA.debugLineNum = 11862070;BA.debugLine="y = \"\"";
_y = (Object)("");
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=11862072;
 //BA.debugLineNum = 11862072;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4a.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=11862073;
 //BA.debugLineNum = 11862073;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Template";
_rs = __ref._dialog /*b4a.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._template /*Object*/ ,_y,(Object)(""),_c);
RDebugUtils.currentLine=11862074;
 //BA.debugLineNum = 11862074;BA.debugLine="RaiseBeforeDialogDisplayed(Template)";
__ref._raisebeforedialogdisplayed /*String*/ (null,__ref._template /*Object*/ );
RDebugUtils.currentLine=11862075;
 //BA.debugLineNum = 11862075;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 68;
return;
case 68:
//C
this.state = 50;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=11862076;
 //BA.debugLineNum = 11862076;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 50:
//if
this.state = 61;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=11862077;
 //BA.debugLineNum = 11862077;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1));
RDebugUtils.currentLine=11862078;
 //BA.debugLineNum = 11862078;BA.debugLine="Dim value As String";
_value = "";
RDebugUtils.currentLine=11862079;
 //BA.debugLineNum = 11862079;BA.debugLine="If Template = DateTemplate Then";
if (true) break;

case 53:
//if
this.state = 60;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ))) { 
this.state = 55;
}else 
{RDebugUtils.currentLine=11862082;
 //BA.debugLineNum = 11862082;BA.debugLine="Else if Template = SearchTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ))) { 
this.state = 57;
}else 
{RDebugUtils.currentLine=11862085;
 //BA.debugLineNum = 11862085;BA.debugLine="Else If Template = ColorTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4a.example.b4xcolortemplate*/ ))) { 
this.state = 59;
}}}
if (true) break;

case 55:
//C
this.state = 60;
RDebugUtils.currentLine=11862080;
 //BA.debugLineNum = 11862080;BA.debugLine="value = DateTime.Date(DateTemplate.Date)";
_value = parent.__c.DateTime.Date(__ref._datetemplate /*b4a.example.b4xdatetemplate*/ ._getdate /*long*/ (null));
RDebugUtils.currentLine=11862081;
 //BA.debugLineNum = 11862081;BA.debugLine="lbl.Text = value";
_lbl.setText(BA.ObjectToCharSequence(_value));
 if (true) break;

case 57:
//C
this.state = 60;
RDebugUtils.currentLine=11862083;
 //BA.debugLineNum = 11862083;BA.debugLine="value = SearchTemplate.SelectedItem";
_value = __ref._searchtemplate /*b4a.example.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=11862084;
 //BA.debugLineNum = 11862084;BA.debugLine="lbl.Text = value";
_lbl.setText(BA.ObjectToCharSequence(_value));
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=11862086;
 //BA.debugLineNum = 11862086;BA.debugLine="value = ColorTemplate.SelectedColor";
_value = BA.NumberToString(__ref._colortemplate /*b4a.example.b4xcolortemplate*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=11862087;
 //BA.debugLineNum = 11862087;BA.debugLine="SetLabelColor(lbl, value)";
__ref._setlabelcolor /*String*/ (null,_lbl,(int)(Double.parseDouble(_value)));
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 22;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
RDebugUtils.currentLine=11862092;
 //BA.debugLineNum = 11862092;BA.debugLine="Return -1 'never happens";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(-1));return;};
RDebugUtils.currentLine=11862093;
 //BA.debugLineNum = 11862093;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tfcolorcode_enterpressed(b4a.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "tfcolorcode_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tfcolorcode_enterpressed", null));}
b4a.example.b4xfloattextfield _ft = null;
int[] _clr = null;
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub tfColorCode_EnterPressed";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim ft As B4XFloatTextField = Sender";
_ft = (b4a.example.b4xfloattextfield)(__c.Sender(ba));
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Dim clr() As Int = HexToColor(ft.Text)";
_clr = __ref._hextocolor /*int[]*/ (null,_ft._gettext /*String*/ (null));
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Dim index As Int = CustomListView1.GetItemFromVie";
_index = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getitemfromview(_ft._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(ind";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(_index).GetView((int) (1));
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="If clr.Length = 1 Then";
if (_clr.length==1) { 
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="SetLabelColor(lbl, clr(0))";
__ref._setlabelcolor /*String*/ (null,_lbl,_clr[(int) (0)]);
 }else {
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="ft.Text = ColorToHex(lbl.Color)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_lbl.getColor()));
 };
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="End Sub";
return "";
}
}