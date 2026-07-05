package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bye  reason: default package */
/* loaded from: classes.dex */
public final class bye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ yze c;

    public /* synthetic */ bye(yze yzeVar, Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
        this.c = yzeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.a;
        Bundle bundle = this.b;
        yze yzeVar = this.c;
        switch (i2) {
            case 0:
                yzeVar.W();
                yzeVar.Y();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                am8.p(string);
                am8.p(string2);
                am8.s(bundle.get(ES6Iterator.VALUE_PROPERTY));
                lte lteVar = (lte) yzeVar.a;
                if (!lteVar.a()) {
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.J.e("Conditional property not set since app measurement is disabled");
                    return;
                }
                g6f g6fVar = new g6f(bundle.getLong("triggered_timestamp"), bundle.get(ES6Iterator.VALUE_PROPERTY), string, string2);
                try {
                    l6f l6fVar = lteVar.E;
                    lte.k(l6fVar);
                    bundle.getString("app_id");
                    ibe F0 = l6fVar.F0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                    lte.k(l6fVar);
                    bundle.getString("app_id");
                    ibe F02 = l6fVar.F0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                    bundle.getString("app_id");
                    lteVar.p().q0(new i4e(bundle.getString("app_id"), string2, g6fVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), F02, bundle.getLong("trigger_timeout"), F0, bundle.getLong("time_to_live"), l6fVar.F0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                yzeVar.W();
                yzeVar.Y();
                String string3 = bundle.getString("name");
                am8.p(string3);
                lte lteVar2 = (lte) yzeVar.a;
                if (!lteVar2.a()) {
                    ppe ppeVar2 = lteVar2.f;
                    lte.m(ppeVar2);
                    ppeVar2.J.e("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                g6f g6fVar2 = new g6f(0L, null, string3, "");
                try {
                    l6f l6fVar2 = lteVar2.E;
                    lte.k(l6fVar2);
                    bundle.getString("app_id");
                    lteVar2.p().q0(new i4e(bundle.getString("app_id"), "", g6fVar2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), l6fVar2.F0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            default:
                l97 l97Var = yzeVar.R;
                lte lteVar3 = (lte) yzeVar.a;
                if (!bundle.isEmpty()) {
                    dre dreVar = lteVar3.e;
                    l6f l6fVar3 = lteVar3.E;
                    t7e t7eVar = lteVar3.d;
                    ppe ppeVar3 = lteVar3.f;
                    lte.k(dreVar);
                    Bundle bundle2 = new Bundle(dreVar.U.b());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            lte.k(l6fVar3);
                            if (l6f.k1(obj)) {
                                l6f.p0(l97Var, null, 27, null, null, 0);
                            }
                            lte.m(ppeVar3);
                            ppeVar3.G.g(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (l6f.C0(str)) {
                            lte.m(ppeVar3);
                            ppeVar3.G.f(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            lte.k(l6fVar3);
                            t7eVar.getClass();
                            if (l6fVar3.b0("param", str, 500, obj)) {
                                l6fVar3.o0(bundle2, str, obj);
                            }
                        }
                    }
                    lte.k(l6fVar3);
                    l6f l6fVar4 = ((lte) t7eVar.a).E;
                    lte.k(l6fVar4);
                    if (l6fVar4.I0(201500000)) {
                        i = 100;
                    } else {
                        i = 25;
                    }
                    if (bundle2.size() > i) {
                        Iterator it = new TreeSet(bundle2.keySet()).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i3++;
                            if (i3 > i) {
                                bundle2.remove(str2);
                            }
                        }
                        lte.k(l6fVar3);
                        l6f.p0(l97Var, null, 26, null, null, 0);
                        lte.m(ppeVar3);
                        ppeVar3.G.e("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                dre dreVar2 = lteVar3.e;
                lte.k(dreVar2);
                dreVar2.U.u(bundle);
                lteVar3.p().c0(bundle);
                return;
        }
    }
}
