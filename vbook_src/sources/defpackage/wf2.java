package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf2  reason: default package */
/* loaded from: classes.dex */
public final class wf2 implements aaa, qh0, k1e {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public wf2() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public static s76 g(wf2 wf2Var, gi1 gi1Var) {
        s76 s76Var;
        l42 l42Var = (l42) ((Map) wf2Var.b).get(gi1Var);
        if (l42Var != null) {
            s76Var = l42Var.a(ks3.a);
        } else {
            s76Var = null;
        }
        if (!(s76Var instanceof s76)) {
            return null;
        }
        return s76Var;
    }

    public static void l(wf2 wf2Var, gi1 gi1Var, l42 l42Var) {
        HashMap hashMap = (HashMap) wf2Var.b;
        gi1Var.getClass();
        l42 l42Var2 = (l42) hashMap.get(gi1Var);
        if (l42Var2 != null && !l42Var2.equals(l42Var)) {
            throw new IllegalArgumentException("Contextual serializer or serializer provider for " + gi1Var + " already registered in this module");
        }
        hashMap.put(gi1Var, l42Var);
        if (nmd.B(gi1Var).isInterface()) {
            wf2Var.a = true;
        }
    }

    @Override // defpackage.aaa
    public void a(gi1 gi1Var, s76 s76Var) {
        l(this, gi1Var, new j42(s76Var));
    }

    public wf2 b() {
        return new wf2((HashMap) this.b, (HashMap) this.c, (HashMap) this.d, (HashMap) this.e, (HashMap) this.f, this.a);
    }

    @Override // defpackage.aaa
    public void c(gi1 gi1Var, xt4 xt4Var) {
        HashMap hashMap = (HashMap) this.f;
        xt4 xt4Var2 = (xt4) hashMap.get(gi1Var);
        if (xt4Var2 != null && !xt4Var2.equals(xt4Var)) {
            vm1.g("Default deserializers provider for ", gi1Var, " is already registered: ", xt4Var2);
        } else {
            hashMap.put(gi1Var, xt4Var);
        }
    }

    public void d(aaa aaaVar) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            gi1 gi1Var = (gi1) entry.getKey();
            l42 l42Var = (l42) entry.getValue();
            if (l42Var instanceof j42) {
                gi1Var.getClass();
                aaaVar.a(gi1Var, ((j42) l42Var).a);
            } else if (l42Var instanceof k42) {
                aaaVar.i(gi1Var, ((k42) l42Var).a);
            } else {
                xk5.o();
                return;
            }
        }
        for (Map.Entry entry2 : ((Map) this.c).entrySet()) {
            gi1 gi1Var2 = (gi1) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                gi1 gi1Var3 = (gi1) entry3.getKey();
                s76 s76Var = (s76) entry3.getValue();
                gi1Var2.getClass();
                gi1Var3.getClass();
                s76Var.getClass();
                aaaVar.h(gi1Var2, gi1Var3, s76Var);
            }
        }
        for (Map.Entry entry4 : ((Map) this.d).entrySet()) {
            gi1 gi1Var4 = (gi1) entry4.getKey();
            xt4 xt4Var = (xt4) entry4.getValue();
            gi1Var4.getClass();
            xt4Var.getClass();
            jsc.u(1, xt4Var);
            aaaVar.e(gi1Var4, xt4Var);
        }
        for (Map.Entry entry5 : ((Map) this.f).entrySet()) {
            gi1 gi1Var5 = (gi1) entry5.getKey();
            xt4 xt4Var2 = (xt4) entry5.getValue();
            gi1Var5.getClass();
            xt4Var2.getClass();
            jsc.u(1, xt4Var2);
            aaaVar.c(gi1Var5, xt4Var2);
        }
    }

    @Override // defpackage.aaa
    public void e(gi1 gi1Var, xt4 xt4Var) {
        HashMap hashMap = (HashMap) this.d;
        xt4 xt4Var2 = (xt4) hashMap.get(gi1Var);
        if (xt4Var2 != null && !xt4Var2.equals(xt4Var)) {
            vm1.g("Default serializers provider for ", gi1Var, " is already registered: ", xt4Var2);
        } else {
            hashMap.put(gi1Var, xt4Var);
        }
    }

    @Override // defpackage.qh0
    public void f(jz1 jz1Var) {
        ((yz4) this.f).J.post(new bv4(this, false, jz1Var, 12));
    }

    @Override // defpackage.aaa
    public void h(gi1 gi1Var, gi1 gi1Var2, s76 s76Var) {
        Object obj;
        gi1 gi1Var3;
        String a = s76Var.e().a();
        HashMap hashMap = (HashMap) this.c;
        Object obj2 = hashMap.get(gi1Var);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(gi1Var, obj2);
        }
        Map map = (Map) obj2;
        HashMap hashMap2 = (HashMap) this.e;
        Object obj3 = hashMap2.get(gi1Var);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(gi1Var, obj3);
        }
        Map map2 = (Map) obj3;
        s76 s76Var2 = (s76) map.get(gi1Var2);
        if (s76Var2 != null && !s76Var2.equals(s76Var)) {
            throw new IllegalArgumentException("Serializer for " + gi1Var2 + " already registered in the scope of " + gi1Var);
        }
        s76 s76Var3 = (s76) map2.get(a);
        if (s76Var3 != null && !s76Var3.equals(s76Var)) {
            Iterator it = ((Iterable) sl1.V(map.entrySet()).b).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == s76Var3) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null && (gi1Var3 = (gi1) entry.getKey()) != null) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + gi1Var + "' have the same serial name '" + a + "': " + s76Var + " for '" + gi1Var2 + "' and " + s76Var3 + " for '" + gi1Var3 + '\'');
            }
            cp8.m(a, " is registered in the module but no Kotlin class is associated with it.", "Name ");
            return;
        }
        map.put(gi1Var2, s76Var);
        map2.put(a, s76Var);
    }

    @Override // defpackage.aaa
    public void i(gi1 gi1Var, xt4 xt4Var) {
        gi1Var.getClass();
        l(this, gi1Var, new k42(xt4Var));
    }

    public synchronized boolean j() {
        boolean z;
        Boolean bool = (Boolean) this.f;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = ((qf4) this.b).j();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        k(z);
        return z;
    }

    public void k(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.f) == null) {
            str2 = "global Firebase setting";
        } else if (this.a) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String o = hl5.o("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", o, null);
        }
    }

    public void m(jz1 jz1Var) {
        oud oudVar = (oud) ((yz4) this.f).F.get((jv) this.c);
        if (oudVar != null) {
            oudVar.n(jz1Var);
        }
    }

    @Override // defpackage.k1e
    public String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty((String) this.e)) {
            jSONObject.put("phoneNumber", (String) this.b);
            jSONObject.put("temporaryProof", (String) this.e);
        } else {
            jSONObject.put("sessionInfo", (String) this.c);
            jSONObject.put("code", (String) this.d);
        }
        String str = (String) this.f;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.a) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public wf2(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.a = z;
    }
}
