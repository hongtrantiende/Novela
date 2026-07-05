package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk8  reason: default package */
/* loaded from: classes.dex */
public final class sk8 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public sk8(int i) {
        switch (i) {
            case 3:
                Boolean bool = Boolean.FALSE;
                this.a = yae.z(bool);
                this.b = new dm8(1.0f);
                this.c = yae.z(bool);
                this.d = new dm8(1.0f);
                this.e = yae.z(bool);
                this.f = yae.z(new ckc(ckc.b));
                this.g = yae.z(bool);
                this.h = yae.z(new zl1(zl1.h));
                return;
            case 4:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                return;
            default:
                this.a = yae.z(-1);
                this.b = yae.z(null);
                this.c = yae.z(0);
                this.d = yae.z(0);
                yae.z(new y78(0L));
                this.e = yae.z(br8.c);
                this.f = yae.z(ks3.a);
                this.g = yae.z(-1);
                this.h = yae.z(-1);
                return;
        }
    }

    public static g99 h(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            xgf v = xgf.v(byteArrayInputStream, g7e.a);
            byteArrayInputStream.close();
            xgf P = hvc.o(v).P();
            l7e l7eVar = (l7e) P.d(5);
            if (!l7eVar.a.equals(P)) {
                if (!l7eVar.b.s()) {
                    l7eVar.d();
                }
                l7e.a(l7eVar.b, P);
            }
            return new g99((wgf) l7eVar, 20);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public int a() {
        return ((Number) ((hm8) this.d).getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public List b() {
        ?? r3;
        hm8 hm8Var = (hm8) this.f;
        if (((Number) ((hm8) this.g).getValue()).intValue() == e() && ((Number) ((hm8) this.h).getValue()).intValue() == a() && !((List) hm8Var.getValue()).isEmpty()) {
            return (List) hm8Var.getValue();
        }
        if (!((List) hm8Var.getValue()).isEmpty()) {
            return (List) hm8Var.getValue();
        }
        rq8 rq8Var = (rq8) ((hm8) this.b).getValue();
        ks3 ks3Var = ks3.a;
        if (rq8Var != null) {
            int e = e();
            int a = a();
            ArrayList arrayList = rq8Var.a;
            if (a > e && !arrayList.isEmpty()) {
                r3 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    qq8 qq8Var = (qq8) obj;
                    int i2 = qq8Var.a;
                    pr8 pr8Var = qq8Var.d;
                    int i3 = qq8Var.b;
                    int max = Math.max(e, i2);
                    int min = Math.min(a, i3);
                    if (max < min) {
                        if (max == qq8Var.a && min == i3) {
                            r3.add(pr8Var);
                        } else {
                            r3.add(new pr8(rq8.b(qq8Var, max), pr8Var.b, rq8.b(qq8Var, min), pr8Var.d));
                        }
                    }
                }
            } else {
                r3 = ks3Var;
            }
        } else {
            r3 = 0;
        }
        if (r3 == 0) {
            return ks3Var;
        }
        return r3;
    }

    public int c() {
        return ((Number) ((hm8) this.a).getValue()).intValue();
    }

    public String d() {
        String str;
        rq8 rq8Var = (rq8) ((hm8) this.b).getValue();
        if (rq8Var != null) {
            int e = e();
            int a = a();
            ArrayList arrayList = rq8Var.a;
            if (a <= e || arrayList.isEmpty()) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    qq8 qq8Var = (qq8) obj;
                    int max = Math.max(e, qq8Var.a);
                    int min = Math.min(a, qq8Var.b);
                    if (max < min) {
                        if (sb.length() > 0) {
                            sb.append(' ');
                        }
                        String str2 = qq8Var.c;
                        int i2 = qq8Var.a;
                        sb.append(str2.substring(max - i2, min - i2));
                    }
                }
                str = sb.toString();
            }
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public int e() {
        return ((Number) ((hm8) this.c).getValue()).intValue();
    }

    public boolean f() {
        if (c() >= 0 && a() > e()) {
            return true;
        }
        return false;
    }

    public synchronized fz4 g() {
        fz4 fz4Var;
        SharedPreferences sharedPreferences;
        try {
            if (((String) this.b) != null) {
                ogf ogfVar = (ogf) this.g;
                if (ogfVar != null && ((k57) this.f) == null) {
                    this.f = new k57(y9e.s(ogfVar.c()), 25);
                }
                synchronized (fz4.f) {
                    Context context = (Context) this.a;
                    String str = (String) this.b;
                    String str2 = (String) this.c;
                    byte[] bArr = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        if (str2 == null) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                        } else {
                            sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                        }
                        try {
                            String string = sharedPreferences.getString(str, null);
                            if (string != null) {
                                bArr = lre.p(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(hl5.n("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        vs.m("keysetName cannot be null");
                    }
                    String str3 = (String) this.d;
                    if (bArr == null) {
                        if (str3 != null) {
                            this.e = j();
                        }
                        k57 k57Var = (k57) this.f;
                        if (k57Var != null) {
                            hvc m = hvc.m(k57Var);
                            rwa rwaVar = new rwa((Context) this.a, (String) this.b, (String) this.c);
                            n2f n2fVar = (n2f) this.e;
                            try {
                                if (n2fVar != null) {
                                    m.E(rwaVar, n2fVar, new byte[0]);
                                } else {
                                    rwaVar.B(m.P());
                                }
                                xgf P = m.P();
                                l7e l7eVar = (l7e) P.d(5);
                                if (!l7eVar.a.equals(P)) {
                                    if (!l7eVar.b.s()) {
                                        l7eVar.d();
                                    }
                                    l7e.a(l7eVar.b, P);
                                }
                                this.h = new g99((wgf) l7eVar, 20);
                            } catch (IOException e) {
                                throw new GeneralSecurityException(e);
                            }
                        } else {
                            throw new GeneralSecurityException("cannot read or generate keyset");
                        }
                    } else if (str3 != null) {
                        this.h = i(bArr);
                    } else {
                        this.h = h(bArr);
                    }
                    fz4Var = new fz4(this);
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        } finally {
        }
        return fz4Var;
    }

    public g99 i(byte[] bArr) {
        try {
            this.e = y9e.t((String) this.d);
            try {
                xgf P = hvc.n(new g99(new ByteArrayInputStream(bArr), 19), (n2f) this.e, new byte[0]).P();
                l7e l7eVar = (l7e) P.d(5);
                if (!l7eVar.a.equals(P)) {
                    if (!l7eVar.b.s()) {
                        l7eVar.d();
                    }
                    l7e.a(l7eVar.b, P);
                }
                return new g99((wgf) l7eVar, 20);
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return h(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                g99 h = h(bArr);
                Object obj = fz4.f;
                Log.w("fz4", "cannot use Android Keystore, it'll be disabled", e2);
                return h;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public n2f j() {
        Object obj = fz4.f;
        try {
            boolean v = y9e.v((String) this.d);
            try {
                return y9e.t((String) this.d);
            } catch (GeneralSecurityException | ProviderException e) {
                if (v) {
                    Object obj2 = fz4.f;
                    Log.w("fz4", "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
                throw new KeyStoreException(hl5.n("the master key ", (String) this.d, " exists but is unusable"), e);
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj3 = fz4.f;
            Log.w("fz4", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    public sk8(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = num;
    }
}
