package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.FirebaseAuth;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: odd  reason: default package */
/* loaded from: classes.dex */
public final class odd implements oa4, a2e, Continuation, x00 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public odd(int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new HashMap();
                return;
            default:
                hvc hvcVar = new hvc(10);
                this.b = hvcVar;
                odd oddVar = new odd((odd) null, hvcVar);
                this.d = oddVar;
                this.c = oddVar.v();
                tk1 tk1Var = new tk1(1);
                this.e = tk1Var;
                oddVar.z("require", new nff(tk1Var));
                tk1Var.a.put("internal.platform", zie.b);
                oddVar.z("runtime.counter", new g4e(Double.valueOf(0.0d)));
                return;
        }
    }

    public void A(String str, e9e e9eVar) {
        if (((HashMap) this.e).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.d;
        if (e9eVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, e9eVar);
        }
    }

    public e9e B(String str) {
        HashMap hashMap = (HashMap) this.d;
        if (hashMap.containsKey(str)) {
            return (e9e) hashMap.get(str);
        }
        odd oddVar = (odd) this.b;
        if (oddVar != null) {
            return oddVar.B(str);
        }
        vs.m(nk2.u(str, " is not defined"));
        return null;
    }

    public gdd a(gi1 gi1Var, String str) {
        gdd gddVar;
        gdd a;
        synchronized (((tw8) this.e)) {
            try {
                gddVar = (gdd) ((qdd) this.b).a.get(str);
                if (gi1Var.h(gddVar)) {
                    ldd lddVar = (ldd) this.c;
                    if (lddVar instanceof vy9) {
                        vy9 vy9Var = (vy9) lddVar;
                        gddVar.getClass();
                        xn6 xn6Var = vy9Var.d;
                        if (xn6Var != null) {
                            s26 s26Var = vy9Var.e;
                            s26Var.getClass();
                            ese.s(gddVar, s26Var, xn6Var);
                        }
                    }
                    gddVar.getClass();
                } else {
                    ru7 ru7Var = new ru7((pb2) this.d);
                    ru7Var.a.put(ndd.a, str);
                    ldd lddVar2 = (ldd) this.c;
                    lddVar2.getClass();
                    try {
                        try {
                            a = lddVar2.c(gi1Var, ru7Var);
                        } catch (AbstractMethodError unused) {
                            a = lddVar2.a(nmd.B(gi1Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        a = lddVar2.b(nmd.B(gi1Var), ru7Var);
                    }
                    gddVar = a;
                    qdd qddVar = (qdd) this.b;
                    qddVar.getClass();
                    gddVar.getClass();
                    gdd gddVar2 = (gdd) qddVar.a.put(str, gddVar);
                    if (gddVar2 != null) {
                        gddVar2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gddVar;
    }

    public Bundle b() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        dre dreVar = (dre) this.e;
        if (((Bundle) this.d) == null) {
            SharedPreferences b0 = dreVar.b0();
            lte lteVar = (lte) dreVar.a;
            String string3 = b0.getString((String) this.b, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            ppe ppeVar = lteVar.f;
                            lte.m(ppeVar);
                            ppeVar.f.e("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            q5e.a();
                                            if (lteVar.d.i0(null, yme.P0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        q5e.a();
                                        if (lteVar.d.i0(null, yme.P0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        ppe ppeVar2 = lteVar.f;
                        lte.m(ppeVar2);
                        ppeVar2.f.f(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.d = bundle;
                } catch (JSONException unused2) {
                    ppe ppeVar3 = lteVar.f;
                    lte.m(ppeVar3);
                    ppeVar3.f.e("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.d) == null) {
                this.d = (Bundle) this.c;
            }
        }
        Bundle bundle2 = (Bundle) this.d;
        am8.s(bundle2);
        return new Bundle(bundle2);
    }

    public f0e c(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Parcelable parcelable;
        y1e a;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(skf.c(jSONArray3.getString(i)));
            }
            f0e f0eVar = new f0e(qf4.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                f0eVar.a = p4e.c(string);
            }
            if (!z) {
                f0eVar.D = Boolean.FALSE;
            }
            f0eVar.C = str;
            if (jSONObject.has("userMetadata") && (a = y1e.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                f0eVar.E = a;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String optString = jSONObject2.optString("factorIdKey");
                    if ("phone".equals(optString)) {
                        parcelable = su8.e(jSONObject2);
                    } else if (Objects.equals(optString, "totp")) {
                        parcelable = iic.e(jSONObject2);
                    } else {
                        parcelable = null;
                    }
                    arrayList2.add(parcelable);
                }
                f0eVar.f(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(i9e.c(new JSONObject(jSONArray.getString(i3))));
                }
                f0eVar.I = arrayList3;
            }
            return f0eVar;
        } catch (ArrayIndexOutOfBoundsException e) {
            e = e;
            Log.wtf((String) ((kj) this.e).b, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            Log.wtf((String) ((kj) this.e).b, e);
            return null;
        } catch (jlf e3) {
            e = e3;
            Log.wtf((String) ((kj) this.e).b, e);
            return null;
        } catch (JSONException e4) {
            e = e4;
            Log.wtf((String) ((kj) this.e).b, e);
            return null;
        }
    }

    @Override // defpackage.x00
    public ListenableFuture call() {
        int i = this.a;
        e73 e73Var = e73.a;
        switch (i) {
            case 19:
                final kn knVar = (kn) this.b;
                final s3 f = dv4.f((ListenableFuture) this.c, new pcf(knVar, 0), e73Var);
                final s3 f2 = dv4.f(f, (b7f) this.d, (Executor) this.e);
                c10 c10Var = new c10() { // from class: tcf
                    @Override // defpackage.c10
                    public final ListenableFuture apply(Object obj) {
                        switch (r1) {
                            case 0:
                                kn knVar2 = (kn) knVar;
                                s3 s3Var = (s3) f2;
                                if (dv4.b((s3) f).equals(dv4.b(s3Var))) {
                                    return dv4.c(obj);
                                }
                                b7f b7fVar = new b7f(2, knVar2, s3Var);
                                int i2 = khf.a;
                                s3 f3 = dv4.f(s3Var, new b7f(4, kff.a(), b7fVar), (n9a) knVar2.e);
                                synchronized (knVar2.E) {
                                }
                                return f3;
                            default:
                                return ((bcf) knVar).c.o((b7f) f, (Executor) f2);
                        }
                    }
                };
                int i2 = khf.a;
                return dv4.f(f2, new b7f(4, kff.a(), c10Var), e73Var);
            default:
                final bcf bcfVar = (bcf) this.b;
                final b7f b7fVar = (b7f) this.d;
                final Executor executor = (Executor) this.e;
                c10 c10Var2 = new c10() { // from class: tcf
                    @Override // defpackage.c10
                    public final ListenableFuture apply(Object obj) {
                        switch (r1) {
                            case 0:
                                kn knVar2 = (kn) bcfVar;
                                s3 s3Var = (s3) executor;
                                if (dv4.b((s3) b7fVar).equals(dv4.b(s3Var))) {
                                    return dv4.c(obj);
                                }
                                b7f b7fVar2 = new b7f(2, knVar2, s3Var);
                                int i22 = khf.a;
                                s3 f3 = dv4.f(s3Var, new b7f(4, kff.a(), b7fVar2), (n9a) knVar2.e);
                                synchronized (knVar2.E) {
                                }
                                return f3;
                            default:
                                return ((bcf) bcfVar).c.o((b7f) b7fVar, (Executor) executor);
                        }
                    }
                };
                int i3 = khf.a;
                return dv4.f((x1) this.c, new b7f(4, kff.a(), c10Var2), e73Var);
        }
    }

    public e9e d(odd oddVar, ove... oveVarArr) {
        e9e e9eVar = e9e.u;
        for (ove oveVar : oveVarArr) {
            e9eVar = hbe.n0(oveVar);
            yae.U((odd) this.d);
            if ((e9eVar instanceof j9e) || (e9eVar instanceof q8e)) {
                e9eVar = ((hvc) this.b).J(oddVar, e9eVar);
            }
        }
        return e9eVar;
    }

    public e9e e(e9e e9eVar) {
        return ((hvc) this.c).J(this, e9eVar);
    }

    public mhe f() {
        xk9 xk9Var;
        hlf b;
        bie bieVar = (bie) this.b;
        if (bieVar != null) {
            xk9 xk9Var2 = (xk9) this.c;
            if (xk9Var2 != null && (xk9Var = (xk9) this.d) != null) {
                if (bieVar.a == ((hlf) xk9Var2.b).a.length) {
                    if (bieVar.b == ((hlf) xk9Var.b).a.length) {
                        if (bieVar.a() && ((Integer) this.e) == null) {
                            hfd.j("Cannot create key without ID requirement with parameters with ID requirement");
                            return null;
                        } else if (!((bie) this.b).a() && ((Integer) this.e) != null) {
                            hfd.j("Cannot create key with ID requirement with parameters without ID requirement");
                            return null;
                        } else {
                            yhe yheVar = ((bie) this.b).e;
                            if (yheVar == yhe.e) {
                                b = o5f.a;
                            } else if (yheVar == yhe.d) {
                                b = o5f.a(((Integer) this.e).intValue());
                            } else if (yheVar == yhe.c) {
                                b = o5f.b(((Integer) this.e).intValue());
                            } else {
                                vs.k("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(yheVar)));
                                return null;
                            }
                            return new mhe((bie) this.b, (xk9) this.c, (xk9) this.d, b, (Integer) this.e);
                        }
                    }
                    hfd.j("HMAC key size mismatch");
                    return null;
                }
                hfd.j("AES key size mismatch");
                return null;
            }
            hfd.j("Cannot build without key material");
            return null;
        }
        hfd.j("Cannot build without parameters");
        return null;
    }

    public oie g() {
        Integer num = (Integer) this.b;
        if (num != null) {
            if (((Integer) this.c) != null) {
                if (((lie) this.e) != null) {
                    if (((Integer) this.d) != null) {
                        return new oie(num.intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (lie) this.e);
                    }
                    hfd.j("Tag size is not set");
                    return null;
                }
                hfd.j("Variant is not set");
                return null;
            }
            hfd.j("IV size is not set");
            return null;
        }
        hfd.j("Key size is not set");
        return null;
    }

    @Override // defpackage.k99
    public Object get() {
        return new odd((Executor) ((k99) this.b).get(), (hw9) ((k99) this.c).get(), (zg4) ((yx9) this.d).get(), (hw9) ((k99) this.e).get(), 2);
    }

    public gje h() {
        Integer num = (Integer) this.b;
        if (num != null) {
            if (((fje) this.e) != null) {
                if (((Integer) this.c) != null) {
                    if (((Integer) this.d) != null) {
                        return new gje(num.intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (fje) this.e);
                    }
                    hfd.j("Tag size is not set");
                    return null;
                }
                hfd.j("IV size is not set");
                return null;
            }
            hfd.j("Variant is not set");
            return null;
        }
        hfd.j("Key size is not set");
        return null;
    }

    public kye i() {
        hye hyeVar = (hye) this.b;
        if (hyeVar != null) {
            fye fyeVar = (fye) this.c;
            if (fyeVar != null) {
                eye eyeVar = (eye) this.d;
                if (eyeVar != null) {
                    gye gyeVar = (gye) this.e;
                    if (gyeVar != null) {
                        return new kye(hyeVar, fyeVar, eyeVar, gyeVar);
                    }
                    hfd.j("HPKE variant is not set");
                    return null;
                }
                hfd.j("HPKE AEAD parameter is not set");
                return null;
            }
            hfd.j("HPKE KDF parameter is not set");
            return null;
        }
        hfd.j("HPKE KEM parameter is not set");
        return null;
    }

    public h8f j() {
        Integer num = (Integer) this.b;
        if (num != null) {
            if (((Integer) this.c) != null) {
                if (((g8f) this.d) != null) {
                    if (((f8f) this.e) != null) {
                        if (num.intValue() >= 16) {
                            Integer num2 = (Integer) this.c;
                            int intValue = num2.intValue();
                            g8f g8fVar = (g8f) this.d;
                            if (intValue >= 10) {
                                if (g8fVar == g8f.b) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                                    }
                                } else if (g8fVar == g8f.c) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                                    }
                                } else if (g8fVar == g8f.d) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                                    }
                                } else if (g8fVar == g8f.e) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                                    }
                                } else if (g8fVar == g8f.f) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                                    }
                                } else {
                                    hfd.j("unknown hash type; must be SHA256, SHA384 or SHA512");
                                    return null;
                                }
                                return new h8f(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (f8f) this.e, (g8f) this.d);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.b));
                    }
                    hfd.j("variant is not set");
                    return null;
                }
                hfd.j("hash type is not set");
                return null;
            }
            hfd.j("tag size is not set");
            return null;
        }
        hfd.j("key size is not set");
        return null;
    }

    @Override // defpackage.a2e
    public void k(l1e l1eVar) {
        ((k57) this.e).I(new b3e((kp3) this.b, ((p4e) l1eVar).b, (String) this.c), (rwa) this.d);
    }

    public void l() {
        this.c = 12;
    }

    public void m(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public void n(String str, String str2) {
        String encodeToString;
        sde c = sde.c((Context) this.b, (String) this.c);
        c.getClass();
        am8.s(str2);
        fz4 fz4Var = c.b;
        String str3 = null;
        if (fz4Var == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (fz4Var) {
                    hvc E0 = c.b.E0();
                    lbe.w();
                    encodeToString = Base64.encodeToString(((sbe) E0.s(cge.a, sbe.class)).b(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                }
                str3 = encodeToString;
            } catch (GeneralSecurityException e) {
                String message = e.getMessage();
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + message);
            }
        }
        if (str3 != null) {
            ((SharedPreferences) this.d).edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }

    public void o(m3f m3fVar) {
        m3fVar.getClass();
        f7f f7fVar = new f7f(t6f.class, m3fVar.a);
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.containsKey(f7fVar)) {
            m3f m3fVar2 = (m3f) hashMap.get(f7fVar);
            if (m3fVar2.equals(m3fVar) && m3fVar == m3fVar2) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(f7fVar)));
        }
        hashMap.put(f7fVar, m3fVar);
    }

    public void p(t3f t3fVar) {
        h7f h7fVar = new h7f(t3fVar.a, t6f.class);
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.containsKey(h7fVar)) {
            t3f t3fVar2 = (t3f) hashMap.get(h7fVar);
            if (t3fVar2.equals(t3fVar) && t3fVar == t3fVar2) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(h7fVar)));
        }
        hashMap.put(h7fVar, t3fVar);
    }

    public void q(u5f u5fVar) {
        u5fVar.getClass();
        f7f f7fVar = new f7f(s6f.class, u5fVar.a);
        HashMap hashMap = (HashMap) this.e;
        if (hashMap.containsKey(f7fVar)) {
            u5f u5fVar2 = (u5f) hashMap.get(f7fVar);
            if (u5fVar2.equals(u5fVar) && u5fVar == u5fVar2) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(f7fVar)));
        }
        hashMap.put(f7fVar, u5fVar);
    }

    public void r(y5f y5fVar) {
        h7f h7fVar = new h7f(y5fVar.a, s6f.class);
        HashMap hashMap = (HashMap) this.d;
        if (hashMap.containsKey(h7fVar)) {
            y5f y5fVar2 = (y5f) hashMap.get(h7fVar);
            if (y5fVar2.equals(y5fVar) && y5fVar == y5fVar2) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(h7fVar)));
        }
        hashMap.put(h7fVar, y5fVar);
    }

    public e9e s(w0e w0eVar) {
        e9e e9eVar = e9e.u;
        Iterator h = w0eVar.h();
        while (h.hasNext()) {
            e9eVar = ((hvc) this.c).J(this, w0eVar.j(((Integer) h.next()).intValue()));
            if (e9eVar instanceof v2e) {
                break;
            }
        }
        return e9eVar;
    }

    public void t(int i) {
        switch (this.a) {
            case 10:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
            default:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, yv] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        yv yvVar;
        yv yvVar2;
        boolean z = false;
        switch (this.a) {
            case 6:
                RecaptchaAction recaptchaAction = (RecaptchaAction) this.b;
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.c;
                String str = (String) this.d;
                xk9 xk9Var = (xk9) this.e;
                if (task.isSuccessful()) {
                    return Tasks.forResult(task.getResult());
                }
                Exception exception = task.getException();
                am8.s(exception);
                SparseArray sparseArray = u0e.a;
                if (exception instanceof yf4) {
                    z = ((yf4) exception).b.endsWith("MISSING_RECAPTCHA_TOKEN");
                }
                if (z) {
                    if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                        Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
                    }
                    synchronized (firebaseAuth) {
                        yvVar = firebaseAuth.j;
                    }
                    if (yvVar == null) {
                        qf4 qf4Var = firebaseAuth.a;
                        fn8 fn8Var = new fn8(11);
                        ?? obj = new Object();
                        obj.a = new Object();
                        obj.b = new HashMap();
                        obj.d = qf4Var;
                        obj.e = firebaseAuth;
                        obj.f = fn8Var;
                        synchronized (firebaseAuth) {
                            firebaseAuth.j = obj;
                        }
                    }
                    synchronized (firebaseAuth) {
                        yvVar2 = firebaseAuth.j;
                    }
                    Task I = yvVar2.I(str, Boolean.FALSE, recaptchaAction);
                    return I.continueWithTask(xk9Var).continueWithTask(new odd(str, yvVar2, recaptchaAction, xk9Var, 7));
                }
                String valueOf = String.valueOf(recaptchaAction);
                String message = exception.getMessage();
                Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf + "with exception - " + message);
                return Tasks.forException(exception);
            default:
                String str2 = (String) this.b;
                if (!task.isSuccessful()) {
                    Exception exception2 = task.getException();
                    am8.s(exception2);
                    SparseArray sparseArray2 = u0e.a;
                    if (exception2 instanceof yf4) {
                        z = ((yf4) exception2).b.endsWith("INVALID_RECAPTCHA_TOKEN");
                    }
                    if (z) {
                        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str2);
                        }
                        return ((yv) this.c).I(str2, Boolean.TRUE, (RecaptchaAction) this.d).continueWithTask((xk9) this.e);
                    }
                    return task;
                }
                return task;
        }
    }

    public void u(Bundle bundle) {
        Bundle bundle2;
        dre dreVar = (dre) this.e;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        SharedPreferences b0 = dreVar.b0();
        lte lteVar = (lte) dreVar.a;
        SharedPreferences.Editor edit = b0.edit();
        int size = bundle2.size();
        String str = (String) this.b;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        q5e.a();
                        if (lteVar.d.i0(null, yme.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                ppe ppeVar = lteVar.f;
                                lte.m(ppeVar);
                                ppeVar.f.f(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                ppe ppeVar2 = lteVar.f;
                                lte.m(ppeVar2);
                                ppeVar2.f.f(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        ppe ppeVar3 = lteVar.f;
                        lte.m(ppeVar3);
                        ppeVar3.f.f(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.d = bundle2;
    }

    public odd v() {
        return new odd(this, (hvc) this.c);
    }

    public String w(String str) {
        String str2;
        String string = ((SharedPreferences) this.d).getString(str, null);
        if (string == null) {
            return null;
        }
        if (string.startsWith("ENCRYPTED:")) {
            sde c = sde.c((Context) this.b, (String) this.c);
            String substring = string.substring(10);
            c.getClass();
            fz4 fz4Var = c.b;
            if (fz4Var == null) {
                Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
                return null;
            }
            try {
                synchronized (fz4Var) {
                    hvc E0 = c.b.E0();
                    lbe.w();
                    str2 = new String(((sbe) E0.s(cge.a, sbe.class)).a(Base64.decode(substring, 2), null), StandardCharsets.UTF_8);
                }
                return str2;
            } catch (IllegalArgumentException | GeneralSecurityException e) {
                String message = e.getMessage();
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
                return null;
            }
        }
        return string;
    }

    public void x() {
        switch (this.a) {
            case 10:
                this.d = 16;
                return;
            default:
                this.d = 16;
                return;
        }
    }

    public boolean y(String str) {
        if (((HashMap) this.d).containsKey(str)) {
            return true;
        }
        odd oddVar = (odd) this.b;
        if (oddVar != null) {
            return oddVar.y(str);
        }
        return false;
    }

    public void z(String str, e9e e9eVar) {
        odd oddVar;
        HashMap hashMap = (HashMap) this.d;
        if (!hashMap.containsKey(str) && (oddVar = (odd) this.b) != null && oddVar.y(str)) {
            oddVar.z(str, e9eVar);
        } else if (((HashMap) this.e).containsKey(str)) {
        } else {
            if (e9eVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, e9eVar);
            }
        }
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        ((rwa) this.d).a(am8.G(str));
    }

    public /* synthetic */ odd(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ odd(int i, boolean z) {
        this.a = i;
    }

    public odd(k57 k57Var, kp3 kp3Var, String str, rwa rwaVar) {
        this.a = 5;
        this.b = kp3Var;
        this.c = str;
        this.d = rwaVar;
        Objects.requireNonNull(k57Var);
        this.e = k57Var;
    }

    public odd(odd oddVar, hvc hvcVar) {
        this.a = 13;
        this.d = new HashMap();
        this.e = new HashMap();
        this.b = oddVar;
        this.c = hvcVar;
    }

    public odd(dre dreVar, String str) {
        this.a = 14;
        this.e = dreVar;
        am8.p(str);
        this.b = str;
        this.c = new Bundle();
    }

    public odd(String str, String str2, String str3) {
        this.a = 1;
        str.getClass();
        str2.getClass();
        str3.getClass();
        zg4 zg4Var = new zg4(str, new qi0(str2, str3));
        this.b = new c3e(zg4Var);
        this.c = new c3e(zg4Var);
        this.d = new c3e(zg4Var);
        this.e = new c3e(zg4Var);
    }

    public odd(qdd qddVar, ldd lddVar, pb2 pb2Var) {
        this.a = 0;
        qddVar.getClass();
        lddVar.getClass();
        pb2Var.getClass();
        this.b = qddVar;
        this.c = lddVar;
        this.d = pb2Var;
        this.e = new tw8(4);
    }

    public odd(c7f c7fVar) {
        this.a = 17;
        this.b = new HashMap(c7fVar.a);
        this.c = new HashMap(c7fVar.b);
        this.d = new HashMap(c7fVar.c);
        this.e = new HashMap(c7fVar.d);
    }
}
