package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k26  reason: default package */
/* loaded from: classes3.dex */
public final class k26 extends IdScriptableObject {
    public static final /* synthetic */ int b = 0;
    public final v26 a;

    public k26(v26 v26Var) {
        this.a = v26Var;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public final Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Object q0;
        if (idFunctionObject != null && idFunctionObject.hasTag("JSBridge")) {
            if (idFunctionObject.methodId() == 1) {
                ArrayList arrayList = new ArrayList();
                String str = "";
                if (objArr != null && (q0 = b00.q0(0, objArr)) != null && (q0 instanceof NativeArray)) {
                    str = String.valueOf(sl1.f0(0, (List) q0));
                    int i = 0;
                    for (Object obj2 : (Iterable) q0) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            if (i > 0) {
                                arrayList.add(Context.jsToJava(obj2, Object.class));
                            }
                            i = i2;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                }
                obj = this.a.h(str, arrayList.toArray(new Object[0]));
                if (obj == null) {
                    obj = Undefined.instance;
                }
            } else {
                obj = Undefined.instance;
            }
            obj.getClass();
            return obj;
        }
        Object execIdCall = super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        execIdCall.getClass();
        return execIdCall;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public final int findPrototypeId(String str) {
        return c16.i(str, "execFunction") ? 1 : 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public final String getClassName() {
        return "JSBridge";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public final void initPrototypeId(int i) {
        if (i == 1) {
            initPrototypeMethod("JSBridge", i, "execFunction", 1);
        }
    }
}
