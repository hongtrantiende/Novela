package org.mozilla.javascript;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class ImporterTopLevel extends TopLevel {
    private static final String AKEY = "importedPackages";
    private static final Object IMPORTER_TAG = "Importer";
    private static final int Id_constructor = 1;
    private static final int Id_importClass = 2;
    private static final int Id_importPackage = 3;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final long serialVersionUID = -9095380847465315412L;
    private boolean topScopeFlag;

    public ImporterTopLevel(Context context, boolean z) {
        initStandardObjects(context, z);
    }

    private static Object[] getNativeJavaPackages(Scriptable scriptable) {
        ArrayList arrayList;
        synchronized (scriptable) {
            try {
                if ((scriptable instanceof ScriptableObject) && (arrayList = (ArrayList) ((ScriptableObject) scriptable).getAssociatedValue(AKEY)) != null) {
                    return arrayList.toArray();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Object getPackageProperty(String str, Scriptable scriptable) {
        Scriptable scriptable2;
        Object obj = Scriptable.NOT_FOUND;
        if (this.topScopeFlag) {
            scriptable2 = ScriptableObject.getTopLevelScope(scriptable);
        } else {
            scriptable2 = scriptable;
        }
        Object[] nativeJavaPackages = getNativeJavaPackages(scriptable2);
        if (nativeJavaPackages == null) {
            return obj;
        }
        for (Object obj2 : nativeJavaPackages) {
            Object pkgProperty = ((NativeJavaPackage) obj2).getPkgProperty(str, scriptable, false);
            if (pkgProperty != null && !(pkgProperty instanceof NativeJavaPackage)) {
                if (obj == Scriptable.NOT_FOUND) {
                    obj = pkgProperty;
                } else {
                    throw Context.reportRuntimeErrorById("msg.ambig.import", obj.toString(), pkgProperty.toString());
                }
            }
        }
        return obj;
    }

    private static void importClass(Scriptable scriptable, NativeJavaClass nativeJavaClass) {
        String name = nativeJavaClass.getClassObject().getName();
        String substring = name.substring(name.lastIndexOf(46) + 1);
        Object obj = scriptable.get(substring, scriptable);
        if (obj != Scriptable.NOT_FOUND) {
            if (obj.equals(nativeJavaClass)) {
                return;
            }
            throw Context.reportRuntimeErrorById("msg.prop.defined", substring);
        }
        scriptable.put(substring, scriptable, nativeJavaClass);
    }

    private static void importPackage(ScriptableObject scriptableObject, NativeJavaPackage nativeJavaPackage) {
        if (nativeJavaPackage == null) {
            return;
        }
        synchronized (scriptableObject) {
            try {
                ArrayList arrayList = (ArrayList) scriptableObject.getAssociatedValue(AKEY);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    scriptableObject.associateValue(AKEY, arrayList);
                }
                for (int i = 0; i != arrayList.size(); i++) {
                    if (nativeJavaPackage.equals(arrayList.get(i))) {
                        return;
                    }
                }
                arrayList.add(nativeJavaPackage);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        new ImporterTopLevel().exportAsJSClass(3, scriptable, z);
    }

    private Object js_construct(Scriptable scriptable, Object[] objArr) {
        ImporterTopLevel importerTopLevel = new ImporterTopLevel();
        for (int i = 0; i != objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof NativeJavaClass) {
                importClass(importerTopLevel, (NativeJavaClass) obj);
            } else if (obj instanceof NativeJavaPackage) {
                importPackage(importerTopLevel, (NativeJavaPackage) obj);
            } else {
                throw Context.reportRuntimeErrorById("msg.not.class.not.pkg", Context.toString(obj));
            }
        }
        importerTopLevel.setParentScope(scriptable);
        importerTopLevel.setPrototype(this);
        return importerTopLevel;
    }

    private static Object js_importClass(Scriptable scriptable, Object[] objArr) {
        for (int i = 0; i != objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof NativeJavaClass) {
                importClass(scriptable, (NativeJavaClass) obj);
            } else {
                throw Context.reportRuntimeErrorById("msg.not.class", Context.toString(obj));
            }
        }
        return Undefined.instance;
    }

    private static Object js_importPackage(ScriptableObject scriptableObject, Object[] objArr) {
        for (int i = 0; i != objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof NativeJavaPackage) {
                importPackage(scriptableObject, (NativeJavaPackage) obj);
            } else {
                throw Context.reportRuntimeErrorById("msg.not.pkg", Context.toString(obj));
            }
        }
        return Undefined.instance;
    }

    private ScriptableObject realScope(Scriptable scriptable, Scriptable scriptable2, IdFunctionObject idFunctionObject) {
        if (this.topScopeFlag) {
            scriptable2 = ScriptableObject.getTopLevelScope(scriptable);
        }
        return (ScriptableObject) IdScriptableObject.ensureType(scriptable2, ScriptableObject.class, idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(IMPORTER_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId != 1) {
            if (methodId != 2) {
                if (methodId == 3) {
                    return js_importPackage(realScope(scriptable, scriptable2, idFunctionObject), objArr);
                }
                vs.m(String.valueOf(methodId));
                return null;
            }
            return js_importClass(realScope(scriptable, scriptable2, idFunctionObject), objArr);
        }
        return js_construct(scriptable, objArr);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 0;
                    break;
                }
                break;
            case 1442890963:
                if (str.equals("importClass")) {
                    c = 1;
                    break;
                }
                break;
            case 1978066145:
                if (str.equals("importPackage")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        Object obj = super.get(str, scriptable);
        if (obj != Scriptable.NOT_FOUND) {
            return obj;
        }
        return getPackageProperty(str, scriptable);
    }

    @Override // org.mozilla.javascript.TopLevel, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        if (this.topScopeFlag) {
            return "global";
        }
        return "JavaImporter";
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        if (!super.has(str, scriptable) && getPackageProperty(str, scriptable) == Scriptable.NOT_FOUND) {
            return false;
        }
        return true;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "importPackage";
                } else {
                    vs.m(String.valueOf(i));
                    return;
                }
            } else {
                str = "importClass";
            }
        } else {
            i2 = 0;
            str = "constructor";
        }
        initPrototypeMethod(IMPORTER_TAG, i, str, i2);
    }

    public void initStandardObjects(Context context, boolean z) {
        context.initStandardObjects(this, z);
        this.topScopeFlag = true;
        IdFunctionObject exportAsJSClass = exportAsJSClass(3, this, false);
        if (z) {
            exportAsJSClass.sealObject();
        }
        delete("constructor");
    }

    public ImporterTopLevel(Context context) {
        this(context, false);
    }

    public ImporterTopLevel() {
    }

    @Deprecated
    public void importPackage(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        js_importPackage(this, objArr);
    }
}
