package defpackage;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.FirebaseAuth;
import com.vbook.android.R;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv  reason: default package */
/* loaded from: classes.dex */
public final class yv implements du1, a2e {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Type inference failed for: r0v4, types: [x1, java.lang.Object] */
    public yv(x00 x00Var) {
        this.b = new AtomicLong(-9223372034707292160L);
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
        e73 e73Var = e73.a;
        this.e = new n9a(e73Var);
        ?? obj = new Object();
        this.f = obj;
        w1f w1fVar = new w1f();
        w1fVar.b = x00Var;
        w1fVar.c = e73Var;
        this.a = w1fVar;
        obj.a(w1fVar, e73Var);
    }

    public static void C(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter f;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = zv.b;
        }
        PorterDuff.Mode mode2 = zv.b;
        synchronized (zv.class) {
            f = dr9.f(i, mode);
        }
        mutate.setColorFilter(f);
    }

    public static boolean i(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList j(Context context, int i) {
        int c = y6c.c(context, R.attr.colorControlHighlight);
        int b = y6c.b(context, R.attr.colorButtonNormal);
        int[] iArr = y6c.b;
        int[] iArr2 = y6c.d;
        int b2 = tn1.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, y6c.c, y6c.f}, new int[]{b, b2, tn1.b(c, i), i});
    }

    public static e67 q(cz8 cz8Var, qs5 qs5Var, e67 e67Var, y9c y9cVar) {
        Object l;
        int i;
        i04 i04Var = (i04) cz8Var;
        aac m = i04Var.m();
        int j = i04Var.j();
        if (m.p()) {
            l = null;
        } else {
            l = m.l(j);
        }
        if (!i04Var.y() && !m.p()) {
            i = m.f(j, y9cVar, false).b(a2d.Q(i04Var.k()) - y9cVar.e);
        } else {
            i = -1;
        }
        int i2 = i;
        for (int i3 = 0; i3 < qs5Var.size(); i3++) {
            e67 e67Var2 = (e67) qs5Var.get(i3);
            if (w(e67Var2, l, i04Var.y(), i04Var.g(), i04Var.h(), i2)) {
                return e67Var2;
            }
        }
        if (!qs5Var.isEmpty() || e67Var == null || !w(e67Var, l, i04Var.y(), i04Var.g(), i04Var.h(), i2)) {
            return null;
        }
        return e67Var;
    }

    public static LayerDrawable u(dr9 dr9Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable d = dr9Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable d2 = dr9Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((d instanceof BitmapDrawable) && d.getIntrinsicWidth() == dimensionPixelSize && d.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) d;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((d2 instanceof BitmapDrawable) && d2.getIntrinsicWidth() == dimensionPixelSize && d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) d2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static boolean w(e67 e67Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = e67Var.a;
        int i4 = e67Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z || i4 != i || e67Var.c != i2) {
            if (z || i4 != -1 || e67Var.e != i3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int y(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            if (i5 >= bArr.length) {
                break;
            }
            i3 = (i3 << 8) | (bArr[i5] & 255);
        }
        return i3;
    }

    public jq8 A(jq8 jq8Var) {
        if (jq8Var == null) {
            return eq8.a;
        }
        int i = 0;
        while (jq8Var instanceof gq8) {
            int i2 = i + 1;
            if (i >= 64) {
                break;
            }
            jq8Var = t(((gq8) jq8Var).a);
            i = i2;
        }
        return jq8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(java.lang.String r5, android.os.Bundle r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.B(java.lang.String, android.os.Bundle, boolean):void");
    }

    public void D(aac aacVar) {
        qs5 qs5Var;
        kj a = rm9.a();
        if (((qs5) this.b).isEmpty()) {
            f(a, (e67) this.e, aacVar);
            if (!Objects.equals((e67) this.f, (e67) this.e)) {
                f(a, (e67) this.f, aacVar);
            }
            if (!Objects.equals((e67) this.d, (e67) this.e) && !Objects.equals((e67) this.d, (e67) this.f)) {
                f(a, (e67) this.d, aacVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((qs5) this.b).size();
                qs5Var = (qs5) this.b;
                if (i >= size) {
                    break;
                }
                f(a, (e67) qs5Var.get(i), aacVar);
                i++;
            }
            if (!qs5Var.contains((e67) this.d)) {
                f(a, (e67) this.d, aacVar);
            }
        }
        this.c = a.d(true);
    }

    public void E(jq8 jq8Var, HashMap hashMap, HashSet hashSet) {
        gq8 gq8Var;
        Integer num;
        cq8 cq8Var;
        aq8 aq8Var;
        String str;
        aq8 aq8Var2 = null;
        if (jq8Var instanceof gq8) {
            gq8Var = (gq8) jq8Var;
        } else {
            gq8Var = null;
        }
        if (gq8Var != null) {
            num = Integer.valueOf(gq8Var.a);
        } else {
            num = null;
        }
        if (num != null) {
            if (!hashSet.contains(num)) {
                hashSet.add(num);
            } else {
                return;
            }
        }
        if (hashSet.size() <= 10000) {
            jq8 A = A(jq8Var);
            if (A instanceof cq8) {
                cq8Var = (cq8) A;
            } else if (A instanceof hq8) {
                cq8Var = ((hq8) A).a;
            } else {
                cq8Var = null;
            }
            if (cq8Var != null) {
                LinkedHashMap linkedHashMap = cq8Var.a;
                jq8 A2 = A((jq8) linkedHashMap.get("Names"));
                if (A2 instanceof aq8) {
                    aq8Var = (aq8) A2;
                } else {
                    aq8Var = null;
                }
                int i = 0;
                if (aq8Var != null) {
                    ArrayList arrayList = aq8Var.a;
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        jq8 A3 = A((jq8) arrayList.get(i2));
                        jq8 jq8Var2 = (jq8) arrayList.get(i3);
                        if (A3 instanceof iq8) {
                            byte[] bArr = ((iq8) A3).a;
                            StringBuilder sb = new StringBuilder(bArr.length);
                            for (byte b : bArr) {
                                sb.append((char) (b & 255));
                            }
                            str = sb.toString();
                        } else if (A3 instanceof dq8) {
                            str = ((dq8) A3).a;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            hashMap.put(str, jq8Var2);
                        }
                        i2 += 2;
                    }
                }
                jq8 A4 = A((jq8) linkedHashMap.get("Kids"));
                if (A4 instanceof aq8) {
                    aq8Var2 = (aq8) A4;
                }
                if (aq8Var2 != null) {
                    ArrayList arrayList2 = aq8Var2.a;
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        E((jq8) obj, hashMap, hashSet);
                    }
                }
            }
        }
    }

    public void F(jq8 jq8Var, HashMap hashMap, int[] iArr, HashSet hashSet, int i) {
        gq8 gq8Var;
        Integer num;
        cq8 cq8Var;
        dq8 dq8Var;
        String str;
        if (i <= 64) {
            int i2 = 0;
            if (iArr[0] <= 1000000) {
                aq8 aq8Var = null;
                if (jq8Var instanceof gq8) {
                    gq8Var = (gq8) jq8Var;
                } else {
                    gq8Var = null;
                }
                if (gq8Var != null) {
                    num = Integer.valueOf(gq8Var.a);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (!hashSet.contains(num)) {
                        hashSet.add(num);
                    } else {
                        return;
                    }
                }
                jq8 A = A(jq8Var);
                if (A instanceof cq8) {
                    cq8Var = (cq8) A;
                } else if (A instanceof hq8) {
                    cq8Var = ((hq8) A).a;
                } else {
                    cq8Var = null;
                }
                if (cq8Var != null) {
                    LinkedHashMap linkedHashMap = cq8Var.a;
                    jq8 A2 = A((jq8) linkedHashMap.get("Type"));
                    if (A2 instanceof dq8) {
                        dq8Var = (dq8) A2;
                    } else {
                        dq8Var = null;
                    }
                    if (dq8Var != null) {
                        str = dq8Var.a;
                    } else {
                        str = null;
                    }
                    jq8 A3 = A((jq8) linkedHashMap.get("Kids"));
                    if (A3 instanceof aq8) {
                        aq8Var = (aq8) A3;
                    }
                    if (!c16.i(str, "Page") && (str != null || aq8Var != null)) {
                        if (aq8Var != null) {
                            ArrayList arrayList = aq8Var.a;
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                F((jq8) obj, hashMap, iArr, hashSet, i + 1);
                            }
                            return;
                        }
                        return;
                    }
                    if (num != null) {
                        hashMap.put(num, Integer.valueOf(iArr[0]));
                    }
                    iArr[0] = iArr[0] + 1;
                }
            }
        }
    }

    public List G(jq8 jq8Var, HashMap hashMap, HashMap hashMap2, HashSet hashSet, int i) {
        gq8 gq8Var;
        Integer num;
        cq8 cq8Var;
        iq8 iq8Var;
        String sb;
        String str;
        HashMap hashMap3;
        HashMap hashMap4;
        int o;
        List list;
        cq8 cq8Var2;
        dq8 dq8Var;
        yv yvVar = this;
        HashSet hashSet2 = hashSet;
        ks3 ks3Var = ks3.a;
        if (i <= 64 && hashSet2.size() <= 5000) {
            ArrayList arrayList = new ArrayList();
            jq8 jq8Var2 = jq8Var;
            int i2 = 0;
            while (jq8Var2 != null && i2 < 5000) {
                int i3 = i2 + 1;
                String str2 = null;
                if (jq8Var2 instanceof gq8) {
                    gq8Var = (gq8) jq8Var2;
                } else {
                    gq8Var = null;
                }
                if (gq8Var != null) {
                    num = Integer.valueOf(gq8Var.a);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (hashSet2.contains(num)) {
                        break;
                    }
                    hashSet2.add(num);
                }
                jq8 A = yvVar.A(jq8Var2);
                if (A instanceof cq8) {
                    cq8Var = (cq8) A;
                } else if (A instanceof hq8) {
                    cq8Var = ((hq8) A).a;
                } else {
                    cq8Var = null;
                }
                if (cq8Var == null) {
                    break;
                }
                LinkedHashMap linkedHashMap = cq8Var.a;
                jq8 A2 = yvVar.A((jq8) linkedHashMap.get("Title"));
                if (A2 instanceof iq8) {
                    iq8Var = (iq8) A2;
                } else {
                    iq8Var = null;
                }
                boolean z = true;
                if (iq8Var == null) {
                    str = "";
                } else {
                    byte[] bArr = iq8Var.a;
                    int i4 = 2;
                    if (bArr.length >= 2 && (bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i5 = i4 + 1;
                            boolean z2 = z;
                            if (i5 >= bArr.length) {
                                break;
                            }
                            sb2.append((char) (((bArr[i4] & 255) << 8) | (bArr[i5] & 255)));
                            i4 += 2;
                            z = z2;
                        }
                        sb = sb2.toString();
                    } else if (bArr.length >= 2 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 254) {
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int i6 = i4 + 1;
                            if (i6 >= bArr.length) {
                                break;
                            }
                            sb3.append((char) (((bArr[i6] & 255) << 8) | (bArr[i4] & 255)));
                            i4 += 2;
                        }
                        sb = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder(bArr.length);
                        for (byte b : bArr) {
                            sb4.append((char) (b & 255));
                        }
                        sb = sb4.toString();
                    }
                    str = sb;
                }
                jq8 jq8Var3 = (jq8) linkedHashMap.get("Dest");
                if (jq8Var3 == null) {
                    jq8 A3 = yvVar.A((jq8) linkedHashMap.get("A"));
                    if (A3 instanceof cq8) {
                        cq8Var2 = (cq8) A3;
                    } else if (A3 instanceof hq8) {
                        cq8Var2 = ((hq8) A3).a;
                    } else {
                        cq8Var2 = null;
                    }
                    if (cq8Var2 != null) {
                        LinkedHashMap linkedHashMap2 = cq8Var2.a;
                        jq8 A4 = yvVar.A((jq8) linkedHashMap2.get("S"));
                        if (A4 instanceof dq8) {
                            dq8Var = (dq8) A4;
                        } else {
                            dq8Var = null;
                        }
                        if (dq8Var != null) {
                            str2 = dq8Var.a;
                        }
                        if (str2 == null || str2.equals("GoTo")) {
                            jq8Var3 = (jq8) linkedHashMap2.get("D");
                        }
                    }
                }
                if (jq8Var3 == null) {
                    hashMap3 = hashMap;
                    hashMap4 = hashMap2;
                    o = 0;
                } else {
                    hashMap3 = hashMap;
                    hashMap4 = hashMap2;
                    o = yvVar.o(jq8Var3, hashMap3, hashMap4);
                }
                jq8 jq8Var4 = (jq8) linkedHashMap.get("First");
                if (jq8Var4 != null) {
                    list = yvVar.G(jq8Var4, hashMap3, hashMap4, hashSet2, i + 1);
                } else {
                    list = ks3Var;
                }
                if (str.length() > 0 || !list.isEmpty()) {
                    arrayList.add(new bh8(o, str, list));
                }
                jq8Var2 = (jq8) linkedHashMap.get("Next");
                if (hashSet.size() > 5000) {
                    break;
                }
                yvVar = this;
                hashSet2 = hashSet;
                i2 = i3;
            }
            return arrayList;
        }
        return ks3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [qoc, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x1, java.lang.Object] */
    public x1 H() {
        AtomicLong atomicLong;
        long j;
        final int i;
        g0 g0Var;
        e73 e73Var = e73.a;
        gca gcaVar = (gca) this.f;
        if (!gcaVar.isDone()) {
            do {
                atomicLong = (AtomicLong) this.b;
                j = atomicLong.get();
                i = (int) (j >>> 32);
            } while (!atomicLong.compareAndSet(j, ((((int) j) + 1) & 4294967295L) | (i << 32)));
            ?? obj = new Object();
            ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.d).getAndSet(obj);
            if (listenableFuture == null) {
                bbf a = khf.a(new jt1(this, i, 19));
                ?? obj2 = new Object();
                obj2.E = new poc((qoc) obj2, a);
                e73Var.execute(obj2);
                g0Var = obj2;
            } else {
                c10 c10Var = new c10() { // from class: gef
                    @Override // defpackage.c10
                    public final /* synthetic */ ListenableFuture apply(Object obj3) {
                        Throwable th = (Throwable) obj3;
                        return yv.this.U(i);
                    }
                };
                int i2 = khf.a;
                g0Var = dv4.a(listenableFuture, Throwable.class, new b7f(4, kff.a(), c10Var), (n9a) this.e);
            }
            obj.n(g0Var);
            kef kefVar = new kef(this, i);
            obj.a(new gp9(14, this, obj, kefVar, false), e73Var);
            return kefVar;
        }
        return gcaVar;
    }

    public Task I(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task continueWithTask;
        String str2 = "*";
        str = (str == null || str.isEmpty()) ? "*" : "*";
        Task P = P(str);
        if (bool.booleanValue() || P == null) {
            if (!str.isEmpty()) {
                str2 = str;
            }
            if (bool.booleanValue() || (continueWithTask = P(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.e;
                hvc hvcVar = firebaseAuth.e;
                String str3 = firebaseAuth.i;
                hvcVar.getClass();
                continueWithTask = hvcVar.q(new mzd(str3, 1)).continueWithTask(new rwa(this, str2));
            }
            P = continueWithTask;
        }
        return P.continueWithTask(new bp9(this, recaptchaAction));
    }

    public bie J() {
        if (((Integer) this.a) != null) {
            if (((Integer) this.b) != null) {
                if (((Integer) this.c) != null) {
                    Integer num = (Integer) this.d;
                    if (num != null) {
                        if (((zhe) this.e) != null) {
                            if (((yhe) this.f) != null) {
                                int intValue = num.intValue();
                                zhe zheVar = (zhe) this.e;
                                if (zheVar == zhe.c) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                    }
                                } else if (zheVar == zhe.d) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                    }
                                } else if (zheVar == zhe.e) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                    }
                                } else if (zheVar == zhe.f) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                    }
                                } else if (zheVar == zhe.C) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                    }
                                } else {
                                    hfd.j("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                    return null;
                                }
                                return new bie(((Integer) this.a).intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (yhe) this.f, (zhe) this.e);
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
                hfd.j("iv size is not set");
                return null;
            }
            hfd.j("HMAC key size is not set");
            return null;
        }
        hfd.j("AES key size is not set");
        return null;
    }

    public yxe K() {
        uxe uxeVar = (uxe) this.a;
        if (uxeVar != null) {
            if (((txe) this.b) != null) {
                if (((bfe) this.d) != null) {
                    if (((vxe) this.e) != null) {
                        uxe uxeVar2 = uxe.e;
                        if (uxeVar != uxeVar2 && ((wxe) this.c) == null) {
                            hfd.j("Point format is not set");
                            return null;
                        } else if (uxeVar == uxeVar2 && ((wxe) this.c) != null) {
                            hfd.j("For Curve25519 point format must not be set");
                            return null;
                        } else {
                            return new yxe((uxe) this.a, (txe) this.b, (wxe) this.c, (bfe) this.d, (vxe) this.e, (hlf) this.f);
                        }
                    }
                    hfd.j("Variant is not set");
                    return null;
                }
                hfd.j("DEM parameters are not set");
                return null;
            }
            hfd.j("Hash type is not set");
            return null;
        }
        hfd.j("Elliptic curve type is not set");
        return null;
    }

    public void L(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public void M(bfe bfeVar) {
        if (yxe.g.contains(bfeVar)) {
            this.d = bfeVar;
            return;
        }
        throw new GeneralSecurityException(hl5.n("Invalid DEM parameters ", String.valueOf(bfeVar), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
    }

    public void N(int i) {
        if (i >= 16) {
            this.b = Integer.valueOf(i);
            return;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
    }

    public void O(String str) {
        q1d.v(p9f.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        q1d.v(!p9f.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public Task P(String str) {
        Task task;
        synchronized (this.a) {
            task = (Task) ((HashMap) this.b).get(str);
        }
        return task;
    }

    public void Q(int i) {
        if (i >= 12 && i <= 16) {
            this.c = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
    }

    public void R(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = p9f.a;
        this.e = str;
    }

    public Uri S() {
        boolean z;
        boolean z2;
        boolean z3;
        String v;
        String concat;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Account account = d9f.a;
        Account account2 = (Account) this.d;
        if (account2.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        q1d.v(z, "Account type contains ':'.", new Object[0]);
        if (account2.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        q1d.v(z2, "Account type contains '/'.", new Object[0]);
        if (account2.name.indexOf(47) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        q1d.v(z3, "Account name contains '/'.", new Object[0]);
        if (d9f.a.equals(account2)) {
            v = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            v = nk2.v(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.e;
        StringBuilder sb = new StringBuilder(s21.a(s21.a(str.length() + 2, 1, str2), 1, v) + String.valueOf(str5).length());
        nk2.C(sb, "/", str, "/", str2);
        String w = nk2.w(sb, "/", v, "/", str5);
        mm9 g = ((ls5) this.f).g();
        Pattern pattern = paf.a;
        if (g.isEmpty()) {
            concat = null;
        } else {
            concat = "transform=".concat(new lie("+", 2).b(g));
        }
        return new Uri.Builder().scheme("android").authority((String) this.a).path(w).encodedFragment(concat).build();
    }

    public void T(int i) {
        if (i >= 10) {
            this.d = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [qoc, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    public x1 U(int i) {
        e73 e73Var;
        AtomicLong atomicLong = (AtomicLong) this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            ds5 ds5Var = ds5.D;
            if (ds5Var != null) {
                return ds5Var;
            }
            return new ds5();
        }
        mef mefVar = new mef(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.c;
            mef mefVar2 = (mef) atomicReference.get();
            if (mefVar2 != null && mefVar2.D > i) {
                ds5 ds5Var2 = ds5.D;
                if (ds5Var2 != null) {
                    return ds5Var2;
                }
                return new ds5();
            }
            while (!atomicReference.compareAndSet(mefVar2, mefVar)) {
                if (atomicReference.get() != mefVar2) {
                    break;
                }
            }
            if (((int) (atomicLong.get() >>> 32)) > i) {
                mefVar.cancel(true);
                while (!atomicReference.compareAndSet(mefVar, null) && atomicReference.get() == mefVar) {
                }
                return mefVar;
            }
            w1f w1fVar = (w1f) this.a;
            x00 x00Var = (x00) w1fVar.b;
            if (x00Var != null && (e73Var = (e73) w1fVar.c) != 0) {
                bbf a = khf.a(x00Var);
                ?? obj = new Object();
                obj.E = new poc((qoc) obj, a);
                e73Var.execute(obj);
                mefVar.n(obj);
                return mefVar;
            }
            mefVar.n((gca) this.f);
            return mefVar;
        }
    }

    @Override // defpackage.du1
    public Object a(Class cls) {
        if (((Set) this.a).contains(mf9.a(cls))) {
            Object a = ((du1) this.f).a(cls);
            if (!cls.equals(fa9.class)) {
                return a;
            }
            fa9 fa9Var = (fa9) a;
            return new Object();
        }
        cp8.r(cls, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.du1
    public Set b(mf9 mf9Var) {
        if (((Set) this.d).contains(mf9Var)) {
            return ((du1) this.f).b(mf9Var);
        }
        cp8.r(mf9Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.du1
    public l99 c(Class cls) {
        return g(mf9.a(cls));
    }

    @Override // defpackage.du1
    public l99 d(mf9 mf9Var) {
        if (((Set) this.e).contains(mf9Var)) {
            return ((du1) this.f).d(mf9Var);
        }
        cp8.r(mf9Var, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // defpackage.du1
    public ve8 e(mf9 mf9Var) {
        if (((Set) this.c).contains(mf9Var)) {
            return ((du1) this.f).e(mf9Var);
        }
        cp8.r(mf9Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    public void f(kj kjVar, e67 e67Var, aac aacVar) {
        if (e67Var != null) {
            if (aacVar.b(e67Var.a) != -1) {
                kjVar.v(e67Var, aacVar);
                return;
            }
            aac aacVar2 = (aac) ((rm9) this.c).get(e67Var);
            if (aacVar2 != null) {
                kjVar.v(e67Var, aacVar2);
            }
        }
    }

    @Override // defpackage.du1
    public l99 g(mf9 mf9Var) {
        if (((Set) this.b).contains(mf9Var)) {
            return ((du1) this.f).g(mf9Var);
        }
        cp8.r(mf9Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.du1
    public Object h(mf9 mf9Var) {
        if (((Set) this.a).contains(mf9Var)) {
            return ((du1) this.f).h(mf9Var);
        }
        cp8.r(mf9Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [l1e, java.lang.Object] */
    @Override // defpackage.a2e
    public void k(l1e l1eVar) {
        j5e j5eVar = new j5e((String) this.a, (String) this.b, (String) this.c, (String) this.d, ((p4e) l1eVar).b, 0);
        k57 k57Var = (k57) this.f;
        qu1 qu1Var = (qu1) k57Var.b;
        yx9 yx9Var = new yx9(k57Var, (rwa) this.e, this);
        h1e h1eVar = (h1e) qu1Var.a;
        ch0.w(h1eVar.f("/signupNewUser", (String) qu1Var.f), j5eVar, yx9Var, new Object(), (bm1) h1eVar.c);
    }

    public Map l(int i) {
        hq8 hq8Var;
        fq8 fq8Var;
        fq8 fq8Var2;
        jq8 t = t(i);
        if (t instanceof hq8) {
            hq8Var = (hq8) t;
        } else {
            hq8Var = null;
        }
        if (hq8Var != null) {
            LinkedHashMap linkedHashMap = hq8Var.a.a;
            byte[] m = m(hq8Var);
            if (m != null) {
                jq8 A = A((jq8) linkedHashMap.get("N"));
                if (A instanceof fq8) {
                    fq8Var = (fq8) A;
                } else {
                    fq8Var = null;
                }
                if (fq8Var != null) {
                    int i2 = (int) fq8Var.a;
                    jq8 A2 = A((jq8) linkedHashMap.get("First"));
                    if (A2 instanceof fq8) {
                        fq8Var2 = (fq8) A2;
                    } else {
                        fq8Var2 = null;
                    }
                    if (fq8Var2 != null) {
                        int i3 = (int) fq8Var2.a;
                        ljc ljcVar = new ljc(null, m, m.length);
                        p88 p88Var = new p88(ljcVar, 0);
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < i2; i4++) {
                            p88Var.B();
                            String l = cne.l(p88Var);
                            if (l == null) {
                                break;
                            }
                            int parseInt = Integer.parseInt(l);
                            p88Var.B();
                            String l2 = cne.l(p88Var);
                            if (l2 == null) {
                                break;
                            }
                            arrayList.add(new yk8(Integer.valueOf(parseInt), Integer.valueOf(Integer.parseInt(l2))));
                        }
                        HashMap hashMap = new HashMap();
                        Iterator it = arrayList.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            yk8 yk8Var = (yk8) next;
                            int intValue = ((Number) yk8Var.a).intValue();
                            int intValue2 = ((Number) yk8Var.b).intValue() + i3;
                            if (intValue2 >= 0 && intValue2 <= m.length) {
                                try {
                                    hashMap.put(Integer.valueOf(intValue), new s26(12, new p88(ljcVar, intValue2), this).H());
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        return hashMap;
                    }
                }
            }
        }
        return ls3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [fq8] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [fq8] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [fq8] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ks3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [fq8] */
    public byte[] m(hq8 hq8Var) {
        List list;
        dq8 dq8Var;
        String str;
        cq8 cq8Var;
        fq8 fq8Var;
        int i;
        Iterator it;
        fq8 fq8Var2;
        int i2;
        fq8 fq8Var3;
        int i3;
        fq8 fq8Var4;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Iterator it2;
        char c;
        yv yvVar = this;
        LinkedHashMap linkedHashMap = hq8Var.a.a;
        jq8 A = yvVar.A((jq8) linkedHashMap.get("Filter"));
        boolean z = A instanceof dq8;
        ?? r6 = ks3.a;
        byte[] bArr2 = null;
        if (z) {
            list = tl1.A(((dq8) A).a);
        } else if (A instanceof aq8) {
            ArrayList arrayList = ((aq8) A).a;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                jq8 A2 = yvVar.A((jq8) obj);
                if (A2 instanceof dq8) {
                    dq8Var = (dq8) A2;
                } else {
                    dq8Var = null;
                }
                if (dq8Var != null) {
                    str = dq8Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            list = arrayList2;
        } else {
            list = r6;
        }
        jq8 jq8Var = (jq8) linkedHashMap.get("DecodeParms");
        if (jq8Var == null) {
            jq8Var = (jq8) linkedHashMap.get("DP");
        }
        jq8 A3 = yvVar.A(jq8Var);
        if (A3 instanceof cq8) {
            r6 = tl1.A(A3);
        } else if (A3 instanceof aq8) {
            ArrayList arrayList3 = ((aq8) A3).a;
            r6 = new ArrayList(tl1.s(arrayList3, 10));
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                jq8 A4 = yvVar.A((jq8) obj2);
                if (A4 instanceof cq8) {
                    cq8Var = (cq8) A4;
                } else {
                    cq8Var = null;
                }
                r6.add(cq8Var);
            }
        }
        byte[] bArr3 = hq8Var.b;
        Iterator it3 = list.iterator();
        int i10 = 0;
        while (it3.hasNext()) {
            int i11 = i10 + 1;
            String str2 = (String) it3.next();
            if (!c16.i(str2, "FlateDecode") && !c16.i(str2, "Fl")) {
                return bArr2;
            }
            bArr3 = zj0.j(bArr3);
            cq8 cq8Var2 = (cq8) sl1.f0(i10, r6);
            if (cq8Var2 != null) {
                LinkedHashMap linkedHashMap2 = cq8Var2.a;
                jq8 A5 = yvVar.A((jq8) linkedHashMap2.get("Predictor"));
                if (A5 instanceof fq8) {
                    fq8Var = (fq8) A5;
                } else {
                    fq8Var = bArr2;
                }
                if (fq8Var != 0) {
                    i = (int) fq8Var.a;
                } else {
                    i = 1;
                }
                if (i > 1) {
                    jq8 A6 = yvVar.A((jq8) linkedHashMap2.get("Colors"));
                    if (A6 instanceof fq8) {
                        fq8Var2 = (fq8) A6;
                    } else {
                        fq8Var2 = bArr2;
                    }
                    if (fq8Var2 != 0) {
                        i2 = (int) fq8Var2.a;
                    } else {
                        i2 = 1;
                    }
                    jq8 A7 = yvVar.A((jq8) linkedHashMap2.get("BitsPerComponent"));
                    if (A7 instanceof fq8) {
                        fq8Var3 = (fq8) A7;
                    } else {
                        fq8Var3 = bArr2;
                    }
                    if (fq8Var3 != 0) {
                        i3 = (int) fq8Var3.a;
                    } else {
                        i3 = 8;
                    }
                    jq8 A8 = yvVar.A((jq8) linkedHashMap2.get("Columns"));
                    if (A8 instanceof fq8) {
                        fq8Var4 = (fq8) A8;
                    } else {
                        fq8Var4 = bArr2;
                    }
                    if (fq8Var4 != 0) {
                        i4 = (int) fq8Var4.a;
                    } else {
                        i4 = 1;
                    }
                    int i12 = i2 * i3;
                    int max = Math.max(1, (i12 + 7) / 8);
                    int i13 = ((i12 * i4) + 7) / 8;
                    if (i13 > 0) {
                        char c2 = 2;
                        if (i == 2) {
                            if (i3 == 8) {
                                bArr3 = Arrays.copyOf(bArr3, bArr3.length);
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14 + i13;
                                    if (i15 > bArr3.length) {
                                        break;
                                    }
                                    for (int i16 = max; i16 < i13; i16++) {
                                        int i17 = i14 + i16;
                                        bArr3[i17] = (byte) (bArr3[i17] + bArr3[i17 - max]);
                                    }
                                    i14 = i15;
                                }
                            }
                        } else {
                            int i18 = i13 + 1;
                            int length = bArr3.length / i18;
                            byte[] bArr4 = new byte[length * i13];
                            byte[] bArr5 = new byte[i13];
                            int i19 = 0;
                            while (i19 < length) {
                                int i20 = i19 * i18;
                                int i21 = bArr3[i20] & 255;
                                byte[] bArr6 = bArr5;
                                bArr5 = new byte[i13];
                                int i22 = 0;
                                while (i22 < i13) {
                                    int i23 = bArr3[i20 + 1 + i22] & 255;
                                    if (i22 >= max) {
                                        i5 = bArr5[i22 - max] & 255;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i24 = bArr6[i22] & 255;
                                    if (i22 >= max) {
                                        i6 = i24;
                                        i7 = bArr6[i22 - max] & 255;
                                    } else {
                                        i6 = i24;
                                        i7 = 0;
                                    }
                                    if (i21 != 1) {
                                        c = 2;
                                        if (i21 != 2) {
                                            if (i21 != 3) {
                                                if (i21 != 4) {
                                                    bArr = bArr3;
                                                    it2 = it3;
                                                } else {
                                                    int i25 = (i5 + i6) - i7;
                                                    int abs = Math.abs(i25 - i5);
                                                    bArr = bArr3;
                                                    int abs2 = Math.abs(i25 - i6);
                                                    it2 = it3;
                                                    int abs3 = Math.abs(i25 - i7);
                                                    if (abs > abs2 || abs > abs3) {
                                                        if (abs2 <= abs3) {
                                                            i5 = i6;
                                                        } else {
                                                            i5 = i7;
                                                        }
                                                    }
                                                    i23 += i5;
                                                }
                                                c = 2;
                                            } else {
                                                bArr = bArr3;
                                                it2 = it3;
                                                c = 2;
                                                i23 += (i5 + i6) / 2;
                                            }
                                        } else {
                                            bArr = bArr3;
                                            it2 = it3;
                                            i23 += i6;
                                        }
                                    } else {
                                        bArr = bArr3;
                                        it2 = it3;
                                        c = 2;
                                        i23 += i5;
                                    }
                                    bArr5[i22] = (byte) (i23 & 255);
                                    i22++;
                                    c2 = c;
                                    it3 = it2;
                                    bArr3 = bArr;
                                }
                                b00.c0(bArr5, i19 * i13, 0, bArr4, 0, 12);
                                i19++;
                                bArr3 = bArr3;
                            }
                            it = it3;
                            bArr3 = bArr4;
                            yvVar = this;
                            i10 = i11;
                            it3 = it;
                            bArr2 = null;
                        }
                    }
                }
                it = it3;
                yvVar = this;
                i10 = i11;
                it3 = it;
                bArr2 = null;
            } else {
                yvVar = this;
                i10 = i11;
            }
        }
        return bArr3;
    }

    public int n(jq8 jq8Var, HashMap hashMap) {
        aq8 aq8Var;
        jq8 jq8Var2;
        int i;
        if (jq8Var instanceof cq8) {
            jq8 jq8Var3 = (jq8) ((cq8) jq8Var).a.get("D");
            if (jq8Var3 != null) {
                return n(A(jq8Var3), hashMap);
            }
            return 0;
        }
        if (jq8Var instanceof aq8) {
            aq8Var = (aq8) jq8Var;
        } else {
            aq8Var = null;
        }
        if (aq8Var != null && (jq8Var2 = (jq8) sl1.e0(aq8Var.a)) != null) {
            if (jq8Var2 instanceof gq8) {
                Integer num = (Integer) hashMap.get(Integer.valueOf(((gq8) jq8Var2).a));
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } else if ((jq8Var2 instanceof fq8) && (i = (int) ((fq8) jq8Var2).a) >= 0) {
                return i;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public int o(jq8 jq8Var, HashMap hashMap, HashMap hashMap2) {
        jq8 jq8Var2;
        jq8 A = A(jq8Var);
        if (A instanceof dq8) {
            jq8 jq8Var3 = (jq8) hashMap2.get(((dq8) A).a);
            if (jq8Var3 != null) {
                return n(A(jq8Var3), hashMap);
            }
        } else if (A instanceof iq8) {
            byte[] bArr = ((iq8) A).a;
            StringBuilder sb = new StringBuilder(bArr.length);
            for (byte b : bArr) {
                sb.append((char) (b & 255));
            }
            jq8 jq8Var4 = (jq8) hashMap2.get(sb.toString());
            if (jq8Var4 != null) {
                return n(A(jq8Var4), hashMap);
            }
        } else if (A instanceof aq8) {
            return n(A, hashMap);
        } else {
            if ((A instanceof cq8) && (jq8Var2 = (jq8) ((cq8) A).a.get("D")) != null) {
                return o(jq8Var2, hashMap, hashMap2);
            }
        }
        return 0;
    }

    public List p() {
        cq8 cq8Var;
        cq8 cq8Var2;
        jq8 jq8Var;
        yv yvVar;
        cq8 cq8Var3;
        cq8 cq8Var4;
        jq8 A = A((jq8) ((LinkedHashMap) this.d).get("Root"));
        jq8 jq8Var2 = null;
        if (A instanceof cq8) {
            cq8Var = (cq8) A;
        } else if (A instanceof hq8) {
            cq8Var = ((hq8) A).a;
        } else {
            cq8Var = null;
        }
        if (cq8Var != null) {
            LinkedHashMap linkedHashMap = cq8Var.a;
            jq8 A2 = A((jq8) linkedHashMap.get("Outlines"));
            if (A2 instanceof cq8) {
                cq8Var2 = (cq8) A2;
            } else if (A2 instanceof hq8) {
                cq8Var2 = ((hq8) A2).a;
            } else {
                cq8Var2 = null;
            }
            if (cq8Var2 != null && (jq8Var = (jq8) cq8Var2.a.get("First")) != null) {
                HashMap hashMap = new HashMap();
                jq8 jq8Var3 = (jq8) linkedHashMap.get("Pages");
                if (jq8Var3 == null) {
                    yvVar = this;
                } else {
                    F(jq8Var3, hashMap, new int[]{0}, new HashSet(), 0);
                    yvVar = this;
                    hashMap = hashMap;
                }
                HashMap hashMap2 = new HashMap();
                jq8 A3 = yvVar.A((jq8) linkedHashMap.get("Dests"));
                if (A3 instanceof cq8) {
                    cq8Var3 = (cq8) A3;
                } else if (A3 instanceof hq8) {
                    cq8Var3 = ((hq8) A3).a;
                } else {
                    cq8Var3 = null;
                }
                if (cq8Var3 != null) {
                    for (Map.Entry entry : cq8Var3.a.entrySet()) {
                        hashMap2.put((String) entry.getKey(), (jq8) entry.getValue());
                    }
                }
                jq8 A4 = yvVar.A((jq8) linkedHashMap.get("Names"));
                if (A4 instanceof cq8) {
                    cq8Var4 = (cq8) A4;
                } else if (A4 instanceof hq8) {
                    cq8Var4 = ((hq8) A4).a;
                } else {
                    cq8Var4 = null;
                }
                if (cq8Var4 != null) {
                    jq8Var2 = (jq8) cq8Var4.a.get("Dests");
                }
                if (jq8Var2 != null) {
                    yvVar.E(jq8Var2, hashMap2, new HashSet());
                }
                return yvVar.G(jq8Var, hashMap, hashMap2, new HashSet(), 0);
            }
        }
        return ks3.a;
    }

    public void r() {
        Messenger messenger;
        s37 s37Var = ((u37) this.f).a;
        eb5 eb5Var = s37Var.f;
        if (eb5Var != null && (messenger = s37Var.g) != null) {
            try {
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.arg1 = 1;
                obtain.setData(null);
                obtain.replyTo = messenger;
                ((Messenger) eb5Var.b).send(obtain);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        s37Var.b.disconnect();
        ((BroadcastReceiver.PendingResult) this.e).finish();
    }

    public ve8 s(Class cls) {
        return e(mf9.a(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [gs9] */
    public jq8 t(int i) {
        Map gs9Var;
        HashMap hashMap = (HashMap) this.e;
        jq8 jq8Var = (jq8) hashMap.get(Integer.valueOf(i));
        if (jq8Var != null) {
            return jq8Var;
        }
        Integer valueOf = Integer.valueOf(i);
        jq8 jq8Var2 = eq8.a;
        hashMap.put(valueOf, jq8Var2);
        ljc ljcVar = (ljc) this.a;
        Integer num = (Integer) ((HashMap) this.b).get(Integer.valueOf(i));
        if (num != null) {
            int i2 = ljcVar.a;
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < i2) {
                try {
                    p88 p88Var = new p88(ljcVar, num.intValue());
                    s26 s26Var = new s26(12, p88Var, this);
                    p88Var.B();
                    cne.l(p88Var);
                    p88Var.B();
                    cne.l(p88Var);
                    p88Var.B();
                    if (cne.u(ljcVar, p88Var.a, "obj")) {
                        p88Var.a = 3 + p88Var.a;
                    }
                    jq8Var2 = s26Var.H();
                } catch (Throwable unused) {
                }
                hashMap.put(Integer.valueOf(i), jq8Var2);
                return jq8Var2;
            }
        }
        yk8 yk8Var = (yk8) ((HashMap) this.c).get(Integer.valueOf(i));
        if (yk8Var != null) {
            int intValue2 = ((Number) yk8Var.a).intValue();
            HashMap hashMap2 = (HashMap) this.f;
            Map map = (Map) hashMap2.get(Integer.valueOf(intValue2));
            if (map == null) {
                Integer valueOf2 = Integer.valueOf(intValue2);
                Map map2 = ls3.a;
                hashMap2.put(valueOf2, map2);
                try {
                    gs9Var = l(intValue2);
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                if (hs9.a(gs9Var) == null) {
                    map2 = gs9Var;
                }
                map = map2;
                hashMap2.put(Integer.valueOf(intValue2), map);
            }
            jq8 jq8Var3 = (jq8) map.get(Integer.valueOf(i));
            if (jq8Var3 != null) {
                jq8Var2 = jq8Var3;
            }
        }
        hashMap.put(Integer.valueOf(i), jq8Var2);
        return jq8Var2;
    }

    public ColorStateList v(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return eze.l(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return eze.l(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = y6c.d(context, R.attr.colorSwitchThumbNormal);
            if (d != null && d.isStateful()) {
                int[] iArr3 = y6c.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = y6c.e;
                iArr2[1] = y6c.c(context, R.attr.colorControlActivated);
                iArr[2] = y6c.f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = y6c.b;
                iArr2[0] = y6c.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = y6c.e;
                iArr2[1] = y6c.c(context, R.attr.colorControlActivated);
                iArr[2] = y6c.f;
                iArr2[2] = y6c.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return j(context, y6c.c(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return j(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return j(context, y6c.c(context, R.attr.colorAccent));
            }
            if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                if (i(i, (int[]) this.b)) {
                    return y6c.d(context, R.attr.colorControlNormal);
                }
                if (i(i, (int[]) this.e)) {
                    return eze.l(context, R.color.abc_tint_default);
                }
                if (i(i, (int[]) this.f)) {
                    return eze.l(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return eze.l(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return eze.l(context, R.color.abc_tint_spinner);
        }
    }

    public void x(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            jq8 jq8Var = (jq8) entry.getValue();
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, jq8Var);
            }
        }
    }

    public eb5 z(int i) {
        hq8 hq8Var;
        aq8 aq8Var;
        fq8 fq8Var;
        int i2;
        fq8 fq8Var2;
        int i3;
        fq8 fq8Var3;
        int i4;
        fq8 fq8Var4;
        int i5;
        aq8 aq8Var2;
        ArrayList arrayList;
        int i6;
        fq8 fq8Var5;
        Integer num;
        int y;
        fq8 fq8Var6;
        int i7;
        fq8 fq8Var7;
        int i8;
        fq8 fq8Var8;
        Integer num2;
        Integer num3;
        fq8 fq8Var9;
        Integer num4;
        fq8 fq8Var10;
        Integer R;
        HashMap hashMap = (HashMap) this.b;
        ljc ljcVar = (ljc) this.a;
        p88 p88Var = new p88(ljcVar, i);
        p88Var.B();
        Integer num5 = null;
        if (cne.u(ljcVar, p88Var.a, "xref")) {
            p88Var.a += 4;
            while (true) {
                p88Var.B();
                if (cne.u(ljcVar, p88Var.a, "trailer")) {
                    p88Var.a += 7;
                    break;
                }
                String l = cne.l(p88Var);
                if (l == null) {
                    break;
                }
                int parseInt = Integer.parseInt(l);
                p88Var.B();
                String l2 = cne.l(p88Var);
                if (l2 == null) {
                    break;
                }
                int parseInt2 = Integer.parseInt(l2);
                p88Var.B();
                for (int i9 = 0; i9 < parseInt2; i9++) {
                    p88Var.B();
                    String l3 = cne.l(p88Var);
                    if (l3 == null) {
                        break;
                    }
                    p88Var.B();
                    cne.l(p88Var);
                    p88Var.B();
                    p88Var.B();
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        int i10 = p88Var.a;
                        if (i10 >= p88Var.b) {
                            break;
                        }
                        int c = ((ljc) p88Var.c).c(i10) & 255;
                        if (p88.y(c) || p88.x(c)) {
                            break;
                        }
                        sb.append((char) c);
                        p88Var.a++;
                    }
                    String sb2 = sb.toString();
                    int i11 = parseInt + i9;
                    if (sb2.equals("n") && (R = r4b.R(10, l3)) != null && !hashMap.containsKey(Integer.valueOf(i11))) {
                        hashMap.put(Integer.valueOf(i11), R);
                    }
                }
            }
            p88Var.B();
            jq8 G = new s26(12, p88Var, this).G();
            if (G instanceof cq8) {
                LinkedHashMap linkedHashMap = ((cq8) G).a;
                x(linkedHashMap);
                Object obj = linkedHashMap.get("Prev");
                if (obj instanceof fq8) {
                    fq8Var9 = (fq8) obj;
                } else {
                    fq8Var9 = null;
                }
                if (fq8Var9 != null) {
                    num4 = Integer.valueOf((int) fq8Var9.a);
                } else {
                    num4 = null;
                }
                Object obj2 = linkedHashMap.get("XRefStm");
                if (obj2 instanceof fq8) {
                    fq8Var10 = (fq8) obj2;
                } else {
                    fq8Var10 = null;
                }
                if (fq8Var10 != null) {
                    num5 = Integer.valueOf((int) fq8Var10.a);
                }
                Integer num6 = num5;
                num5 = num4;
                num3 = num6;
            } else {
                num3 = null;
            }
            return new eb5(17, num5, num3);
        }
        HashMap hashMap2 = (HashMap) this.c;
        p88 p88Var2 = new p88(ljcVar, i);
        p88Var2.B();
        cne.l(p88Var2);
        p88Var2.B();
        cne.l(p88Var2);
        p88Var2.B();
        if (cne.u(ljcVar, p88Var2.a, "obj")) {
            p88Var2.a += 3;
            jq8 G2 = new s26(12, p88Var2, this).G();
            if (G2 instanceof hq8) {
                hq8Var = (hq8) G2;
            } else {
                hq8Var = null;
            }
            if (hq8Var != null) {
                LinkedHashMap linkedHashMap2 = hq8Var.a.a;
                x(linkedHashMap2);
                byte[] m = m(hq8Var);
                if (m == null) {
                    Object obj3 = linkedHashMap2.get("Prev");
                    if (obj3 instanceof fq8) {
                        fq8Var8 = (fq8) obj3;
                    } else {
                        fq8Var8 = null;
                    }
                    if (fq8Var8 != null) {
                        num2 = Integer.valueOf((int) fq8Var8.a);
                    } else {
                        num2 = null;
                    }
                    return new eb5(17, num2, (Object) null);
                }
                jq8 A = A((jq8) linkedHashMap2.get("W"));
                if (A instanceof aq8) {
                    aq8Var = (aq8) A;
                } else {
                    aq8Var = null;
                }
                if (aq8Var != null) {
                    ArrayList arrayList2 = aq8Var.a;
                    if (arrayList2.size() >= 3) {
                        jq8 A2 = A((jq8) arrayList2.get(0));
                        if (A2 instanceof fq8) {
                            fq8Var = (fq8) A2;
                        } else {
                            fq8Var = null;
                        }
                        if (fq8Var != null) {
                            i2 = (int) fq8Var.a;
                        } else {
                            i2 = 0;
                        }
                        jq8 A3 = A((jq8) arrayList2.get(1));
                        if (A3 instanceof fq8) {
                            fq8Var2 = (fq8) A3;
                        } else {
                            fq8Var2 = null;
                        }
                        if (fq8Var2 != null) {
                            i3 = (int) fq8Var2.a;
                        } else {
                            i3 = 0;
                        }
                        jq8 A4 = A((jq8) arrayList2.get(2));
                        if (A4 instanceof fq8) {
                            fq8Var3 = (fq8) A4;
                        } else {
                            fq8Var3 = null;
                        }
                        if (fq8Var3 != null) {
                            i4 = (int) fq8Var3.a;
                        } else {
                            i4 = 0;
                        }
                        int i12 = i2 + i3 + i4;
                        if (i12 > 0) {
                            jq8 A5 = A((jq8) linkedHashMap2.get("Size"));
                            if (A5 instanceof fq8) {
                                fq8Var4 = (fq8) A5;
                            } else {
                                fq8Var4 = null;
                            }
                            if (fq8Var4 != null) {
                                i5 = (int) fq8Var4.a;
                            } else {
                                i5 = 0;
                            }
                            jq8 A6 = A((jq8) linkedHashMap2.get("Index"));
                            if (A6 instanceof aq8) {
                                aq8Var2 = (aq8) A6;
                            } else {
                                aq8Var2 = null;
                            }
                            if (aq8Var2 != null) {
                                arrayList = aq8Var2.a;
                            } else {
                                arrayList = null;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (arrayList != null) {
                                int i13 = 0;
                                while (true) {
                                    int i14 = i13 + 1;
                                    if (i14 >= arrayList.size()) {
                                        break;
                                    }
                                    jq8 A7 = A((jq8) arrayList.get(i13));
                                    if (A7 instanceof fq8) {
                                        fq8Var6 = (fq8) A7;
                                    } else {
                                        fq8Var6 = null;
                                    }
                                    int i15 = i12;
                                    if (fq8Var6 != null) {
                                        i7 = (int) fq8Var6.a;
                                    } else {
                                        i7 = 0;
                                    }
                                    jq8 A8 = A((jq8) arrayList.get(i14));
                                    if (A8 instanceof fq8) {
                                        fq8Var7 = (fq8) A8;
                                    } else {
                                        fq8Var7 = null;
                                    }
                                    if (fq8Var7 != null) {
                                        i8 = (int) fq8Var7.a;
                                    } else {
                                        i8 = 0;
                                    }
                                    arrayList3.add(new yk8(Integer.valueOf(i7), Integer.valueOf(i8)));
                                    i13 += 2;
                                    i12 = i15;
                                }
                                i6 = i12;
                            } else {
                                i6 = i12;
                                arrayList3.add(new yk8(0, Integer.valueOf(i5)));
                            }
                            Iterator it = arrayList3.iterator();
                            it.getClass();
                            int i16 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                yk8 yk8Var = (yk8) next;
                                int intValue = ((Number) yk8Var.a).intValue();
                                int intValue2 = ((Number) yk8Var.b).intValue();
                                int i17 = 0;
                                while (i17 < intValue2) {
                                    int i18 = i16 + i6;
                                    if (i18 <= m.length) {
                                        if (i2 == 0) {
                                            y = 1;
                                        } else {
                                            y = y(m, i16, i2);
                                        }
                                        int i19 = i16 + i2;
                                        int y2 = y(m, i19, i3);
                                        int y3 = y(m, i19 + i3, i4);
                                        int i20 = intValue + i17;
                                        Iterator it2 = it;
                                        if (y != 1) {
                                            if (y == 2 && !hashMap.containsKey(Integer.valueOf(i20)) && !hashMap2.containsKey(Integer.valueOf(i20))) {
                                                hashMap2.put(Integer.valueOf(i20), new yk8(Integer.valueOf(y2), Integer.valueOf(y3)));
                                            }
                                        } else if (!hashMap.containsKey(Integer.valueOf(i20)) && !hashMap2.containsKey(Integer.valueOf(i20))) {
                                            hashMap.put(Integer.valueOf(i20), Integer.valueOf(y2));
                                        }
                                        i17++;
                                        it = it2;
                                        i16 = i18;
                                    }
                                }
                                it = it;
                            }
                            Object obj4 = linkedHashMap2.get("Prev");
                            if (obj4 instanceof fq8) {
                                fq8Var5 = (fq8) obj4;
                            } else {
                                fq8Var5 = null;
                            }
                            if (fq8Var5 != null) {
                                num = Integer.valueOf((int) fq8Var5.a);
                            } else {
                                num = null;
                            }
                            return new eb5(17, num, (Object) null);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        ((rwa) this.e).a(am8.G(str));
    }

    public /* synthetic */ yv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public /* synthetic */ yv(Context context) {
        this.b = "files";
        this.c = "common";
        this.d = p9f.b;
        this.e = "";
        this.f = qs5.i();
        q1d.v(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public yv(String str, String str2, Set set) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = wka.a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw rs8.f(it);
    }

    public yv(ljc ljcVar) {
        this.a = ljcVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new LinkedHashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }
}
