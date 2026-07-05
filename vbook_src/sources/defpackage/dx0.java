package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dx0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dx0 implements u26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dx0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u26
    public final void a(Object[] objArr) {
        String str;
        Object gs9Var;
        Object value;
        wx0 wx0Var;
        int i = this.a;
        String str2 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                fy0 fy0Var = (fy0) obj;
                Object n0 = b00.n0(objArr);
                if (n0 instanceof String) {
                    str = (String) n0;
                } else {
                    str = null;
                }
                if (str != null) {
                    cza czaVar = fy0Var.F;
                    if (((wx0) czaVar.getValue()).a) {
                        try {
                            s46 s46Var = gy0.a;
                            s46Var.getClass();
                            gs9Var = (List) s46Var.a(new sz(hlc.Companion.serializer(), 0), str);
                        } catch (Throwable th) {
                            gs9Var = new gs9(th);
                        }
                        if (gs9Var instanceof gs9) {
                            gs9Var = null;
                        }
                        List list = (List) gs9Var;
                        if (list == null) {
                            list = ks3.a;
                        }
                        if (!list.isEmpty()) {
                            if (czaVar != null) {
                                do {
                                    value = czaVar.getValue();
                                    wx0Var = (wx0) value;
                                } while (!czaVar.l(value, wx0.a(wx0Var, false, null, null, null, null, null, null, wx0Var.h + 1, Token.SWITCH)));
                                m41 a = k27.a(jdd.a(fy0Var).a.plus(fy0Var.L));
                                sw2 sw2Var = ab3.a;
                                z87.v(a, ru2.c, null, new n0(fy0Var, list, null, 16), 2);
                                return;
                            }
                            m41 a2 = k27.a(jdd.a(fy0Var).a.plus(fy0Var.L));
                            sw2 sw2Var2 = ab3.a;
                            z87.v(a2, ru2.c, null, new n0(fy0Var, list, null, 16), 2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                i55 i55Var = (i55) obj;
                String valueOf = String.valueOf(b00.q0(0, objArr));
                Object q0 = b00.q0(1, objArr);
                if (q0 != null) {
                    str2 = q0.toString();
                }
                synchronized (i55Var.h) {
                    i55Var.e.put(valueOf, str2);
                }
                return;
        }
    }
}
