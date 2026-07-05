package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n07  reason: default package */
/* loaded from: classes.dex */
public class n07 implements ry8, l29, oa4, mm1, a6, OnFailureListener, o8b {
    public static final fw4 c = new fw4(1);
    public static final d38 d = new d38(10);
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, l97] */
    /* JADX WARN: Type inference failed for: r7v7, types: [k07, java.lang.Object] */
    public n07(int i) {
        ja7 ja7Var;
        this.a = i;
        switch (i) {
            case 1:
                b8e[] b8eVarArr = {tn3.M, d};
                ?? obj = new Object();
                obj.a = b8eVarArr;
                byte[] bArr = n7e.a;
                this.b = obj;
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new w4(this);
                    return;
                } else {
                    this.b = new w4(this);
                    return;
                }
            case 5:
                this.b = new AtomicBoolean(false);
                return;
            case 26:
                this.b = new km8();
                return;
            default:
                w89 w89Var = w89.c;
                try {
                    ja7Var = (ja7) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    ja7Var = c;
                }
                ja7[] ja7VarArr = {fw4.b, ja7Var};
                ?? obj2 = new Object();
                obj2.a = ja7VarArr;
                Charset charset = uz5.a;
                this.b = obj2;
                return;
        }
    }

    public v4 b(int i) {
        return null;
    }

    @Override // defpackage.ry8
    public void c(qy8 qy8Var) {
        if (qy8Var == qy8.c) {
            kg0 kg0Var = (kg0) this.b;
            kg0Var.d++;
            kg0Var.d();
        }
    }

    @Override // defpackage.mm1
    public long d() {
        z03 z03Var = (z03) this.b;
        ft9 ft9Var = (ft9) nye.q(z03Var, jt9.b);
        return ((h27) nye.q(z03Var, j27.a)).a.f;
    }

    @Override // defpackage.a6
    public void e(Object obj) {
        int i;
        Map map = (Map) obj;
        hs4 hs4Var = (hs4) this.b;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((Boolean) arrayList.get(i2)).booleanValue()) {
                i = 0;
            } else {
                i = -1;
            }
            iArr[i2] = i;
        }
        ds4 ds4Var = (ds4) hs4Var.F.pollFirst();
        if (ds4Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = ds4Var.a;
        if (hs4Var.c.t(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override // defpackage.l29
    public long g(uy5 uy5Var, long j, tc6 tc6Var, long j2) {
        long j3;
        boolean z;
        int i = uy5Var.a + ((int) (((py5) ((vt4) this.b).invoke()).a >> 32));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j >> 32);
        if (tc6Var == tc6.a) {
            z = true;
        } else {
            z = false;
        }
        return (sze.c(uy5Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (sze.c(i, i2, i3, z) << 32);
    }

    @Override // defpackage.k99
    public Object get() {
        switch (this.a) {
            case 11:
                return new ij1(20, (Context) ((u4) this.b).b, new tw8(7), new jf8(7));
            default:
                String packageName = ((Context) ((k99) this.b).get()).getPackageName();
                if (packageName == null) {
                    xk5.k("Cannot return null from a non-@Nullable @Provides method");
                    return null;
                }
                return packageName;
        }
    }

    public String h(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            f46 f46Var = (f46) this.b;
            t56 t56Var = new t56(stringWriter, f46Var.a, f46Var.b, f46Var.c, f46Var.d);
            t56Var.h(obj);
            t56Var.j();
            t56Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void i(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public void j(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    @Override // defpackage.o8b
    public void k(byte[] bArr, int i, int i2, n8b n8bVar, h12 h12Var) {
        boolean z;
        td2 a;
        boolean z2;
        km8 km8Var = (km8) this.b;
        km8Var.K(bArr, i2 + i);
        km8Var.M(i);
        ArrayList arrayList = new ArrayList();
        while (km8Var.a() > 0) {
            if (km8Var.a() >= 8) {
                z = true;
            } else {
                z = false;
            }
            wq9.r("Incomplete Mp4Webvtt Top Level box header found.", z);
            int m = km8Var.m();
            if (km8Var.m() == 1987343459) {
                int i3 = m - 8;
                CharSequence charSequence = null;
                sd2 sd2Var = null;
                while (i3 > 0) {
                    if (i3 >= 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    wq9.r("Incomplete vtt cue box header found.", z2);
                    int m2 = km8Var.m();
                    int m3 = km8Var.m();
                    int i4 = m2 - 8;
                    byte[] bArr2 = km8Var.a;
                    int i5 = km8Var.b;
                    String str = a2d.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    km8Var.N(i4);
                    i3 = (i3 - 8) - i4;
                    if (m3 == 1937011815) {
                        zhd zhdVar = new zhd();
                        aid.e(str2, zhdVar);
                        sd2Var = zhdVar.a();
                    } else if (m3 == 1885436268) {
                        charSequence = aid.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (sd2Var != null) {
                    sd2Var.a = charSequence;
                    sd2Var.b = null;
                    a = sd2Var.a();
                } else {
                    Pattern pattern = aid.a;
                    zhd zhdVar2 = new zhd();
                    zhdVar2.c = charSequence;
                    a = zhdVar2.a().a();
                }
                arrayList.add(a);
            } else {
                km8Var.N(m - 8);
            }
        }
        h12Var.accept(new wd2(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void l(long j) {
        long b = e4c.b(j);
        byte b2 = 0;
        if (!f4c.a(b, 0L)) {
            if (f4c.a(b, 4294967296L)) {
                b2 = 1;
            } else if (f4c.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        i(b2);
        if (!f4c.a(e4c.b(j), 0L)) {
            j(e4c.c(j));
        }
    }

    @Override // defpackage.o8b
    public int m() {
        return 2;
    }

    public v4 n(int i) {
        return null;
    }

    public yya o() {
        cq3 a = cq3.a();
        if (a.c() == 1) {
            return new gs5(true);
        }
        hm8 z = yae.z(Boolean.FALSE);
        a.h(new ou2(z, this));
        return z;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        exc.getClass();
        ((f61) this.b).resumeWith(new gs9(exc));
    }

    public KeyListener p(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((kw5) ((mce) this.b).a).getClass();
            if (keyListener instanceof lq3) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new lq3(keyListener);
        }
        return keyListener;
    }

    public boolean q(int i, int i2, Bundle bundle) {
        return false;
    }

    public void r(boolean z) {
        yr3 yr3Var = (yr3) ((kw5) ((mce) this.b).a).c;
        if (yr3Var.c != z) {
            if (yr3Var.b != null) {
                cq3 a = cq3.a();
                xr3 xr3Var = yr3Var.b;
                a.getClass();
                jsc.w(xr3Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(xr3Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            yr3Var.c = z;
            if (z) {
                yr3.a(yr3Var.a, cq3.a().c());
            }
        }
    }

    public void s(int i, Object obj, j0a j0aVar) {
        fl1 fl1Var = (fl1) this.b;
        fl1Var.B(i, 3);
        j0aVar.i((x2) obj, fl1Var.a);
        fl1Var.B(i, 4);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                String locale = ((Locale) this.b).toString();
                locale.getClass();
                return locale;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n07(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public n07(int[] iArr) {
        this.a = 27;
        iArr.getClass();
        this.b = Arrays.copyOf(iArr, iArr.length);
    }

    public n07(fl1 fl1Var) {
        this.a = 9;
        wz5.a(fl1Var, "output");
        this.b = fl1Var;
        fl1Var.a = this;
    }

    public n07(WorkDatabase workDatabase) {
        this.a = 19;
        workDatabase.getClass();
        this.b = workDatabase;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mce] */
    public n07(wv wvVar) {
        this.a = 4;
        ?? obj = new Object();
        obj.a = new kw5(wvVar);
        this.b = obj;
    }

    public /* synthetic */ n07(int i, boolean z) {
        this.a = i;
    }

    public n07(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 8;
        this.b = bottomSheetBehavior;
        new og(this, 1);
    }

    public void a(int i, v4 v4Var, String str, Bundle bundle) {
    }
}
