package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xplusminus extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xplusminus");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xplusminus.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlplus = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlminus = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblplus = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblminus = null;
public String _formation = "";
public boolean _mcyclic = false;
public boolean _mrapid = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _mainlabel = null;
public int _arrowssize = 0;
public anywheresoftware.b4a.objects.collections.List _mstringitems = null;
public double _mstartrange = 0;
public double _minterval = 0;
public double _mendrange = 0;
public int _mselectedindex = 0;
public int _loopindex = 0;
public int _rapidperiod1 = 0;
public int _rapidperiod2 = 0;
public b4a.example.b4xformatter _formatter = null;
public boolean _stringmode = false;
public int _size = 0;
public boolean _mhaptic = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _getselectedvalue(b4a.example.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "getselectedvalue", true))
	 {return ((Object) Debug.delegate(ba, "getselectedvalue", null));}
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Public Sub getSelectedValue As Object";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="Return GetValueImpl (mSelectedIndex)";
if (true) return __ref._getvalueimpl /*Object*/ (null,__ref._mselectedindex /*int*/ );
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="End Sub";
return null;
}
public String  _setnumericrange(b4a.example.b4xplusminus __ref,double _startrange,double _endrange,double _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setnumericrange", true))
	 {return ((String) Debug.delegate(ba, "setnumericrange", new Object[] {_startrange,_endrange,_interval}));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub SetNumericRange (StartRange As Double,";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Size = Ceil((EndRange - StartRange) / Interval) +";
__ref._size /*int*/  = (int) (__c.Ceil((_endrange-_startrange)/(double)_interval)+1);
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="mStartRange = StartRange";
__ref._mstartrange /*double*/  = _startrange;
RDebugUtils.currentLine=26804227;
 //BA.debugLineNum = 26804227;BA.debugLine="mEndRange = EndRange";
__ref._mendrange /*double*/  = _endrange;
RDebugUtils.currentLine=26804228;
 //BA.debugLineNum = 26804228;BA.debugLine="mInterval = Interval";
__ref._minterval /*double*/  = _interval;
RDebugUtils.currentLine=26804229;
 //BA.debugLineNum = 26804229;BA.debugLine="StringMode = False";
__ref._stringmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=26804230;
 //BA.debugLineNum = 26804230;BA.debugLine="SetIndex(0, False)";
__ref._setindex /*String*/ (null,(int) (0),__c.False);
RDebugUtils.currentLine=26804231;
 //BA.debugLineNum = 26804231;BA.debugLine="End Sub";
return "";
}
public String  _setstringitems(b4a.example.b4xplusminus __ref,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setstringitems", true))
	 {return ((String) Debug.delegate(ba, "setstringitems", new Object[] {_list}));}
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub SetStringItems (list As List)";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="mStringItems = list";
__ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/  = _list;
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="StringMode = True";
__ref._stringmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="Size = mStringItems.Size";
__ref._size /*int*/  = __ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="SetIndex(-1, False)";
__ref._setindex /*String*/ (null,(int) (-1),__c.False);
RDebugUtils.currentLine=26738693;
 //BA.debugLineNum = 26738693;BA.debugLine="End Sub";
return "";
}
public String  _setselectedvalue(b4a.example.b4xplusminus __ref,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setselectedvalue", true))
	 {return ((String) Debug.delegate(ba, "setselectedvalue", new Object[] {_v}));}
double _n = 0;
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Public Sub setSelectedValue (v As Object)";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="If StringMode Then";
if (__ref._stringmode /*boolean*/ ) { 
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="SetIndex(mStringItems.IndexOf(v), False)";
__ref._setindex /*String*/ (null,__ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_v),__c.False);
 }else {
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="Dim n As Double = v";
_n = (double)(BA.ObjectToNumber(_v));
RDebugUtils.currentLine=26935301;
 //BA.debugLineNum = 26935301;BA.debugLine="SetIndex(Min(Size - 1, Max(0, Round((n - mStartR";
__ref._setindex /*String*/ (null,(int) (__c.Min(__ref._size /*int*/ -1,__c.Max(0,__c.Round((_n-__ref._mstartrange /*double*/ )/(double)__ref._minterval /*double*/ )))),__c.False);
 };
RDebugUtils.currentLine=26935303;
 //BA.debugLineNum = 26935303;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.b4xplusminus __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="If Formation = \"Horizontal\" Then";
if ((__ref._formation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, 0, ArrowsSize,";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._arrowssize /*int*/ ,(int) (_height));
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width - ArrowsSize,";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._arrowssize /*int*/ ),(int) (0),__ref._arrowssize /*int*/ ,(int) (_height));
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }else 
{RDebugUtils.currentLine=26673157;
 //BA.debugLineNum = 26673157;BA.debugLine="Else if Formation = \"Vertical\" Then";
if ((__ref._formation /*String*/ ).equals("Vertical")) { 
RDebugUtils.currentLine=26673158;
 //BA.debugLineNum = 26673158;BA.debugLine="pnlPlus.SetLayoutAnimated(0, 0, 0, Width, Arrows";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),__ref._arrowssize /*int*/ );
RDebugUtils.currentLine=26673159;
 //BA.debugLineNum = 26673159;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height-__ref._arrowssize /*int*/ ),(int) (_width),__ref._arrowssize /*int*/ );
RDebugUtils.currentLine=26673160;
 //BA.debugLineNum = 26673160;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }else {
RDebugUtils.currentLine=26673162;
 //BA.debugLineNum = 26673162;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (_height-__ref._arrowssize /*int*/ ),(int) (_width/(double)2),__ref._arrowssize /*int*/ );
RDebugUtils.currentLine=26673163;
 //BA.debugLineNum = 26673163;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width / 2, pnlMinus";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width/(double)2),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=26673164;
 //BA.debugLineNum = 26673164;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height-__ref._arrowssize /*int*/ +__c.DipToCurrent((int) (5))));
 }}
;
RDebugUtils.currentLine=26673166;
 //BA.debugLineNum = 26673166;BA.debugLine="lblMinus.SetLayoutAnimated(0, 0, 0, pnlMinus.Widt";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=26673167;
 //BA.debugLineNum = 26673167;BA.debugLine="lblPlus.SetLayoutAnimated(0, 0, 0, pnlPlus.Width,";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=26673168;
 //BA.debugLineNum = 26673168;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=26476549;
 //BA.debugLineNum = 26476549;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=26476550;
 //BA.debugLineNum = 26476550;BA.debugLine="Public pnlPlus, pnlMinus As B4XView";
_pnlplus = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlminus = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476551;
 //BA.debugLineNum = 26476551;BA.debugLine="Public lblPlus, lblMinus As B4XView";
_lblplus = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lblminus = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476552;
 //BA.debugLineNum = 26476552;BA.debugLine="Public Formation As String";
_formation = "";
RDebugUtils.currentLine=26476553;
 //BA.debugLineNum = 26476553;BA.debugLine="Public mCyclic As Boolean";
_mcyclic = false;
RDebugUtils.currentLine=26476554;
 //BA.debugLineNum = 26476554;BA.debugLine="Public mRapid As Boolean";
_mrapid = false;
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="Public MainLabel As B4XView";
_mainlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26476556;
 //BA.debugLineNum = 26476556;BA.debugLine="Public ArrowsSize As Int = 30dip";
_arrowssize = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=26476557;
 //BA.debugLineNum = 26476557;BA.debugLine="Private mStringItems As List";
_mstringitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26476558;
 //BA.debugLineNum = 26476558;BA.debugLine="Private mStartRange, mInterval, mEndRange As Doub";
_mstartrange = 0;
_minterval = 0;
_mendrange = 0;
RDebugUtils.currentLine=26476559;
 //BA.debugLineNum = 26476559;BA.debugLine="Private mSelectedIndex As Int = -1";
_mselectedindex = (int) (-1);
RDebugUtils.currentLine=26476560;
 //BA.debugLineNum = 26476560;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=26476561;
 //BA.debugLineNum = 26476561;BA.debugLine="Public RapidPeriod1 As Int = 1000";
_rapidperiod1 = (int) (1000);
RDebugUtils.currentLine=26476562;
 //BA.debugLineNum = 26476562;BA.debugLine="Public RapidPeriod2 As Int = 30";
_rapidperiod2 = (int) (30);
RDebugUtils.currentLine=26476563;
 //BA.debugLineNum = 26476563;BA.debugLine="Public Formatter As B4XFormatter";
_formatter = new b4a.example.b4xformatter();
RDebugUtils.currentLine=26476564;
 //BA.debugLineNum = 26476564;BA.debugLine="Private StringMode As Boolean";
_stringmode = false;
RDebugUtils.currentLine=26476565;
 //BA.debugLineNum = 26476565;BA.debugLine="Private Size As Int";
_size = 0;
RDebugUtils.currentLine=26476566;
 //BA.debugLineNum = 26476566;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=26476567;
 //BA.debugLineNum = 26476567;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.b4xplusminus __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_text}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Private Sub CreateLabel (text As String) As B4XVie";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="xlbl.Font = xui.CreateMaterialIcons(30)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (30)));
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="xlbl.Text = text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="xlbl.TextColor = MainLabel.TextColor";
_xlbl.setTextColor(__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="Return xlbl";
if (true) return _xlbl;
RDebugUtils.currentLine=27459592;
 //BA.debugLineNum = 27459592;BA.debugLine="End Sub";
return null;
}
public String  _decrement(b4a.example.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "decrement", true))
	 {return ((String) Debug.delegate(ba, "decrement", null));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Public Sub Decrement";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="If mSelectedIndex <= 0 Then";
if (__ref._mselectedindex /*int*/ <=0) { 
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="If mCyclic Then";
if (__ref._mcyclic /*boolean*/ ) { 
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="mSelectedIndex = Size";
__ref._mselectedindex /*int*/  = __ref._size /*int*/ ;
 }else {
RDebugUtils.currentLine=27197445;
 //BA.debugLineNum = 27197445;BA.debugLine="mSelectedIndex = 0";
__ref._mselectedindex /*int*/  = (int) (0);
RDebugUtils.currentLine=27197446;
 //BA.debugLineNum = 27197446;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=27197447;
 //BA.debugLineNum = 27197447;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=27197450;
 //BA.debugLineNum = 27197450;BA.debugLine="SetIndex(mSelectedIndex - 1, True)";
__ref._setindex /*String*/ (null,(int) (__ref._mselectedindex /*int*/ -1),__c.True);
RDebugUtils.currentLine=27197451;
 //BA.debugLineNum = 27197451;BA.debugLine="End Sub";
return "";
}
public String  _setindex(b4a.example.b4xplusminus __ref,int _i,boolean _raiseevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_i,_raiseevent}));}
Object _value = null;
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Private Sub SetIndex(i As Int, RaiseEvent As Boole";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="If i >= Size Then i = -1";
if (_i>=__ref._size /*int*/ ) { 
_i = (int) (-1);};
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="mSelectedIndex = i";
__ref._mselectedindex /*int*/  = _i;
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="If mSelectedIndex = -1 Then";
if (__ref._mselectedindex /*int*/ ==-1) { 
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="MainLabel.Text = \"\"";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 }else {
RDebugUtils.currentLine=27066374;
 //BA.debugLineNum = 27066374;BA.debugLine="Dim value As Object = GetValueImpl (mSelectedInd";
_value = __ref._getvalueimpl /*Object*/ (null,__ref._mselectedindex /*int*/ );
RDebugUtils.currentLine=27066375;
 //BA.debugLineNum = 27066375;BA.debugLine="If StringMode Then";
if (__ref._stringmode /*boolean*/ ) { 
RDebugUtils.currentLine=27066376;
 //BA.debugLineNum = 27066376;BA.debugLine="InternalSetTextOrCSBuilderToLabel(MainLabel, va";
__ref._internalsettextorcsbuildertolabel /*String*/ (null,__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_value);
 }else {
RDebugUtils.currentLine=27066378;
 //BA.debugLineNum = 27066378;BA.debugLine="MainLabel.Text = Formatter.Format(value)";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatter /*b4a.example.b4xformatter*/ ._format /*String*/ (null,(double)(BA.ObjectToNumber(_value)))));
 };
RDebugUtils.currentLine=27066380;
 //BA.debugLineNum = 27066380;BA.debugLine="If RaiseEvent And xui.SubExists(mCallBack, mEven";
if (_raiseevent && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_valuechanged",(int) (1))) { 
RDebugUtils.currentLine=27066381;
 //BA.debugLineNum = 27066381;BA.debugLine="CallSub2(mCallBack, mEventName & \"_valuechanged";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_valuechanged",_value);
 };
 };
RDebugUtils.currentLine=27066384;
 //BA.debugLineNum = 27066384;BA.debugLine="lblPlus.Enabled = Size > 0 And (mCyclic Or mSelec";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._size /*int*/ >0 && (__ref._mcyclic /*boolean*/  || __ref._mselectedindex /*int*/ <__ref._size /*int*/ -1));
RDebugUtils.currentLine=27066385;
 //BA.debugLineNum = 27066385;BA.debugLine="lblMinus.Enabled = Size > 0 And (mCyclic Or mSele";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._size /*int*/ >0 && (__ref._mcyclic /*boolean*/  || __ref._mselectedindex /*int*/ >0));
RDebugUtils.currentLine=27066386;
 //BA.debugLineNum = 27066386;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.b4xplusminus __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="MainLabel = lbl";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="Dim pnl As B4XView = Props.Get(\"page\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_props.Get((Object)("page"))));
RDebugUtils.currentLine=26607631;
 //BA.debugLineNum = 26607631;BA.debugLine="pnlPlus = xui.CreatePanel(\"pnlArrow\")";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlArrow");
RDebugUtils.currentLine=26607632;
 //BA.debugLineNum = 26607632;BA.debugLine="pnlMinus = xui.CreatePanel(\"pnlArrow\")";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlArrow");
RDebugUtils.currentLine=26607634;
 //BA.debugLineNum = 26607634;BA.debugLine="pnlPlus.Tag = True";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(__c.True));
RDebugUtils.currentLine=26607635;
 //BA.debugLineNum = 26607635;BA.debugLine="pnlMinus.Tag = False";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(__c.False));
RDebugUtils.currentLine=26607636;
 //BA.debugLineNum = 26607636;BA.debugLine="Formation = Props.Get(\"Orientation\")";
__ref._formation /*String*/  = BA.ObjectToString(_props.Get((Object)("Orientation")));
RDebugUtils.currentLine=26607637;
 //BA.debugLineNum = 26607637;BA.debugLine="mCyclic = Props.Get(\"Cyclic\")";
__ref._mcyclic /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Cyclic")));
RDebugUtils.currentLine=26607638;
 //BA.debugLineNum = 26607638;BA.debugLine="mRapid = Props.Get(\"Rapid\")";
__ref._mrapid /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Rapid")));
RDebugUtils.currentLine=26607639;
 //BA.debugLineNum = 26607639;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=26607640;
 //BA.debugLineNum = 26607640;BA.debugLine="Formatter.GetDefaultFormat.FormatFont = MainLabel";
__ref._formatter /*b4a.example.b4xformatter*/ ._getdefaultformat /*b4a.example.b4xformatter._b4xformatdata*/ (null).FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=26607641;
 //BA.debugLineNum = 26607641;BA.debugLine="Formatter.GetDefaultFormat.TextColor = MainLabel.";
__ref._formatter /*b4a.example.b4xformatter*/ ._getdefaultformat /*b4a.example.b4xformatter._b4xformatdata*/ (null).TextColor /*int*/  = __ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();
RDebugUtils.currentLine=26607642;
 //BA.debugLineNum = 26607642;BA.debugLine="If Formation = \"Horizontal\" Then";
if ((__ref._formation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=26607643;
 //BA.debugLineNum = 26607643;BA.debugLine="lblPlus = CreateLabel(Chr(0xE315))";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe315))));
RDebugUtils.currentLine=26607644;
 //BA.debugLineNum = 26607644;BA.debugLine="lblMinus = CreateLabel(Chr(0xE314))";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe314))));
 }else {
RDebugUtils.currentLine=26607646;
 //BA.debugLineNum = 26607646;BA.debugLine="lblPlus = CreateLabel(Chr(0xE316))";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe316))));
RDebugUtils.currentLine=26607647;
 //BA.debugLineNum = 26607647;BA.debugLine="lblMinus = CreateLabel(Chr(0xE313))";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr(((int)0xe313))));
 };
RDebugUtils.currentLine=26607649;
 //BA.debugLineNum = 26607649;BA.debugLine="lblMinus.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=26607650;
 //BA.debugLineNum = 26607650;BA.debugLine="lblPlus.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=26607651;
 //BA.debugLineNum = 26607651;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=26607652;
 //BA.debugLineNum = 26607652;BA.debugLine="mBase.AddView(MainLabel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mainlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=26607653;
 //BA.debugLineNum = 26607653;BA.debugLine="mBase.AddView(pnlPlus, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=26607654;
 //BA.debugLineNum = 26607654;BA.debugLine="mBase.AddView(pnlMinus, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=26607655;
 //BA.debugLineNum = 26607655;BA.debugLine="pnlPlus.AddView(lblPlus, 0, 0, 0, 0)";
__ref._pnlplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=26607656;
 //BA.debugLineNum = 26607656;BA.debugLine="pnlMinus.AddView(lblMinus, 0, 0, 0, 0)";
__ref._pnlminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblminus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=26607657;
 //BA.debugLineNum = 26607657;BA.debugLine="SetIndex(-1, False)";
__ref._setindex /*String*/ (null,(int) (-1),__c.False);
RDebugUtils.currentLine=26607658;
 //BA.debugLineNum = 26607658;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=26607659;
 //BA.debugLineNum = 26607659;BA.debugLine="End Sub";
return "";
}
public Object  _getvalueimpl(b4a.example.b4xplusminus __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "getvalueimpl", true))
	 {return ((Object) Debug.delegate(ba, "getvalueimpl", new Object[] {_index}));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Private Sub GetValueImpl (Index As Int) As Object";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="If StringMode Then";
if (__ref._stringmode /*boolean*/ ) { 
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="Return mStringItems.Get(Index)";
if (true) return __ref._mstringitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index);
 }else {
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="If Index = Size - 1 Then";
if (_index==__ref._size /*int*/ -1) { 
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="Return mEndRange";
if (true) return (Object)(__ref._mendrange /*double*/ );
 }else {
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="Return mStartRange + Index * mInterval";
if (true) return (Object)(__ref._mstartrange /*double*/ +_index*__ref._minterval /*double*/ );
 };
 };
RDebugUtils.currentLine=27000842;
 //BA.debugLineNum = 27000842;BA.debugLine="End Sub";
return null;
}
public String  _increment(b4a.example.b4xplusminus __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "increment", true))
	 {return ((String) Debug.delegate(ba, "increment", null));}
double _v1 = 0;
double _v2 = 0;
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Public Sub Increment";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="If mSelectedIndex = Size - 3 And StringMode = Fal";
if (__ref._mselectedindex /*int*/ ==__ref._size /*int*/ -3 && __ref._stringmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="Dim v1 As Double = GetValueImpl(mSelectedIndex +";
_v1 = (double)(BA.ObjectToNumber(__ref._getvalueimpl /*Object*/ (null,(int) (__ref._mselectedindex /*int*/ +1))));
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="Dim v2 As Double = GetValueImpl(mSelectedIndex +";
_v2 = (double)(BA.ObjectToNumber(__ref._getvalueimpl /*Object*/ (null,(int) (__ref._mselectedindex /*int*/ +2))));
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="If Formatter.Format(v1) = Formatter.Format(v2) T";
if ((__ref._formatter /*b4a.example.b4xformatter*/ ._format /*String*/ (null,_v1)).equals(__ref._formatter /*b4a.example.b4xformatter*/ ._format /*String*/ (null,_v2))) { 
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="mSelectedIndex = mSelectedIndex + 1";
__ref._mselectedindex /*int*/  = (int) (__ref._mselectedindex /*int*/ +1);
 };
 };
RDebugUtils.currentLine=27131912;
 //BA.debugLineNum = 27131912;BA.debugLine="If mSelectedIndex >= Size - 1 Then";
if (__ref._mselectedindex /*int*/ >=__ref._size /*int*/ -1) { 
RDebugUtils.currentLine=27131913;
 //BA.debugLineNum = 27131913;BA.debugLine="If mCyclic Then";
if (__ref._mcyclic /*boolean*/ ) { 
RDebugUtils.currentLine=27131914;
 //BA.debugLineNum = 27131914;BA.debugLine="mSelectedIndex = -1";
__ref._mselectedindex /*int*/  = (int) (-1);
 }else {
RDebugUtils.currentLine=27131916;
 //BA.debugLineNum = 27131916;BA.debugLine="mSelectedIndex = Size - 1";
__ref._mselectedindex /*int*/  = (int) (__ref._size /*int*/ -1);
RDebugUtils.currentLine=27131917;
 //BA.debugLineNum = 27131917;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=27131918;
 //BA.debugLineNum = 27131918;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=27131921;
 //BA.debugLineNum = 27131921;BA.debugLine="SetIndex(mSelectedIndex + 1, True)";
__ref._setindex /*String*/ (null,(int) (__ref._mselectedindex /*int*/ +1),__c.True);
RDebugUtils.currentLine=27131922;
 //BA.debugLineNum = 27131922;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xplusminus __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=26542083;
 //BA.debugLineNum = 26542083;BA.debugLine="Formatter.Initialize";
__ref._formatter /*b4a.example.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=26542084;
 //BA.debugLineNum = 26542084;BA.debugLine="End Sub";
return "";
}
public String  _internalsettextorcsbuildertolabel(b4a.example.b4xplusminus __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "internalsettextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "internalsettextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=27525132;
 //BA.debugLineNum = 27525132;BA.debugLine="End Sub";
return "";
}
public String  _pnlarrow_touch(b4a.example.b4xplusminus __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "pnlarrow_touch", true))
	 {return ((String) Debug.delegate(ba, "pnlarrow_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Private Sub pnlArrow_Touch (Action As Int, X As Fl";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Touch(Action = lblPlus.TOUCH_ACTION_DOWN, Action";
__ref._touch /*String*/ (null,_action==__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,_action!=__ref._lblplus /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="End Sub";
return "";
}
public String  _touch(b4a.example.b4xplusminus __ref,boolean _start,boolean _stop,anywheresoftware.b4a.objects.B4XViewWrapper _pnl) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "touch", true))
	 {return ((String) Debug.delegate(ba, "touch", new Object[] {_start,_stop,_pnl}));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Private Sub Touch (Start As Boolean, Stop As Boole";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="If pnl.GetView(0).Enabled = False Then Return";
if (_pnl.GetView((int) (0)).getEnabled()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="If Start Then";
if (_start) { 
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,_pnl);};
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="If pnl.Tag = True Then";
if ((_pnl.getTag()).equals((Object)(__c.True))) { 
RDebugUtils.currentLine=27328517;
 //BA.debugLineNum = 27328517;BA.debugLine="Increment";
__ref._increment /*String*/ (null);
RDebugUtils.currentLine=27328518;
 //BA.debugLineNum = 27328518;BA.debugLine="StartDownLoop(True)";
__ref._startdownloop /*void*/ (null,__c.True);
 }else {
RDebugUtils.currentLine=27328520;
 //BA.debugLineNum = 27328520;BA.debugLine="Decrement";
__ref._decrement /*String*/ (null);
RDebugUtils.currentLine=27328521;
 //BA.debugLineNum = 27328521;BA.debugLine="StartDownLoop(False)";
__ref._startdownloop /*void*/ (null,__c.False);
 };
 }else 
{RDebugUtils.currentLine=27328523;
 //BA.debugLineNum = 27328523;BA.debugLine="Else If Stop Then";
if (_stop) { 
RDebugUtils.currentLine=27328524;
 //BA.debugLineNum = 27328524;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
 }}
;
RDebugUtils.currentLine=27328526;
 //BA.debugLineNum = 27328526;BA.debugLine="End Sub";
return "";
}
public void  _startdownloop(b4a.example.b4xplusminus __ref,boolean _up) throws Exception{
RDebugUtils.currentModule="b4xplusminus";
if (Debug.shouldDelegate(ba, "startdownloop", true))
	 {Debug.delegate(ba, "startdownloop", new Object[] {_up}); return;}
ResumableSub_StartDownLoop rsub = new ResumableSub_StartDownLoop(this,__ref,_up);
rsub.resume(ba, null);
}
public static class ResumableSub_StartDownLoop extends BA.ResumableSub {
public ResumableSub_StartDownLoop(b4a.example.b4xplusminus parent,b4a.example.b4xplusminus __ref,boolean _up) {
this.parent = parent;
this.__ref = __ref;
this._up = _up;
this.__ref = parent;
}
b4a.example.b4xplusminus __ref;
b4a.example.b4xplusminus parent;
boolean _up;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xplusminus";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="If mRapid = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._mrapid /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="Sleep(RapidPeriod1)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xplusminus", "startdownloop"),__ref._rapidperiod1 /*int*/ );
this.state = 19;
return;
case 19:
//C
this.state = 7;
;
RDebugUtils.currentLine=27394053;
 //BA.debugLineNum = 27394053;BA.debugLine="Do While MyIndex = LoopIndex";
if (true) break;

case 7:
//do while
this.state = 18;
while (_myindex==__ref._loopindex /*int*/ ) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=27394054;
 //BA.debugLineNum = 27394054;BA.debugLine="If Up Then Increment Else Decrement";
if (true) break;

case 10:
//if
this.state = 17;
if (_up) { 
this.state = 12;
;}
else {
this.state = 14;
;}if (true) break;

case 12:
//C
this.state = 17;
__ref._increment /*String*/ (null);
if (true) break;

case 14:
//C
this.state = 17;
__ref._decrement /*String*/ (null);
if (true) break;

case 17:
//C
this.state = 7;
;
RDebugUtils.currentLine=27394055;
 //BA.debugLineNum = 27394055;BA.debugLine="Sleep(RapidPeriod2)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xplusminus", "startdownloop"),__ref._rapidperiod2 /*int*/ );
this.state = 20;
return;
case 20:
//C
this.state = 7;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=27394057;
 //BA.debugLineNum = 27394057;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}