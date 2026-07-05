package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qu1  reason: default package */
/* loaded from: classes.dex */
public final class qu1 implements du1, o8b, oa4 {
    public static final ou1 D = new ou1(0);
    public static final byte[] E = {0, 7, 8, 15};
    public static final byte[] F = {0, 119, -120, -1};
    public static final byte[] G = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object C;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qu1(Executor executor, ArrayList arrayList, ArrayList arrayList2, ju1 ju1Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        hx3 hx3Var = new hx3(executor);
        this.e = hx3Var;
        this.C = ju1Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(pt1.c(hx3Var, hx3.class, r7b.class, fa9.class));
        int i = 0;
        arrayList3.add(pt1.c(this, qu1.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            pt1 pt1Var = (pt1) obj;
            if (pt1Var != null) {
                arrayList3.add(pt1Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((l99) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((ju1) this.C).a(componentRegistrar));
                        it.remove();
                    }
                } catch (r16 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((pt1) it2.next()).b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                dae.i(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                dae.i(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                pt1 pt1Var2 = (pt1) obj4;
                ((HashMap) this.a).put(pt1Var2, new ze6(new pu1(0, this, pt1Var2)));
            }
            arrayList5.addAll(A(arrayList3));
            arrayList5.addAll(B());
            z();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            p((HashMap) this.a, bool.booleanValue());
        }
    }

    public static mb0 i(mb0 mb0Var, s6f s6fVar, oe4 oe4Var, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        lb0 a = mb0Var.a();
        String e = ((xd4) s6fVar.b).e();
        if (e != null) {
            a.e = new zb0(e);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        o40 o40Var = (o40) oe4Var.e;
        if (isEmpty) {
            k96 k96Var = (k96) ((AtomicMarkableReference) o40Var.b).getReference();
            synchronized (k96Var) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(k96Var.a));
            }
        } else {
            k96 k96Var2 = (k96) ((AtomicMarkableReference) o40Var.b).getReference();
            synchronized (k96Var2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(k96Var2.a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String a2 = k96.a(1024, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(a2)) {
                    i++;
                } else {
                    hashMap.put(a2, k96.a(1024, (String) entry.getValue()));
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List t = t(unmodifiableMap2);
        k96 k96Var3 = (k96) ((AtomicMarkableReference) ((o40) oe4Var.f).b).getReference();
        synchronized (k96Var3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(k96Var3.a));
        }
        List t2 = t(unmodifiableMap3);
        if (!t.isEmpty() || !t2.isEmpty()) {
            nb0 nb0Var = (nb0) mb0Var.c;
            a.c = new nb0(nb0Var.a, t, t2, nb0Var.d, nb0Var.e, nb0Var.f, nb0Var.g);
        }
        return a.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ac0] */
    public static ma2 j(mb0 mb0Var, oe4 oe4Var) {
        List unmodifiableList;
        jt1 jt1Var = (jt1) oe4Var.C;
        synchronized (jt1Var) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) jt1Var.c));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < unmodifiableList.size(); i++) {
            yt9 yt9Var = (yt9) unmodifiableList.get(i);
            yt9Var.getClass();
            ?? obj = new Object();
            cd0 cd0Var = (cd0) yt9Var;
            String str = cd0Var.e;
            if (str != null) {
                String str2 = cd0Var.b;
                if (str2 != null) {
                    obj.a = new cc0(str2, str);
                    String str3 = cd0Var.c;
                    if (str3 != null) {
                        obj.b = str3;
                        obj.c = cd0Var.d;
                        obj.d = cd0Var.f;
                        obj.e = (byte) (obj.e | 1);
                        arrayList.add(obj.a());
                    } else {
                        xk5.k("Null parameterKey");
                        return null;
                    }
                } else {
                    xk5.k("Null rolloutId");
                    return null;
                }
            } else {
                xk5.k("Null variantId");
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            return mb0Var;
        }
        lb0 a = mb0Var.a();
        a.f = new dc0(arrayList);
        return a.a();
    }

    public static byte[] l(int i, int i2, ea1 ea1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ea1Var.g(i2);
        }
        return bArr;
    }

    public static String n(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static qu1 o(Context context, al5 al5Var, oe4 oe4Var, vw vwVar, s6f s6fVar, oe4 oe4Var2, s26 s26Var, tc0 tc0Var, s26 s26Var2, f92 f92Var, ij1 ij1Var) {
        ra2 ra2Var = new ra2(context, al5Var, vwVar, s26Var, tc0Var);
        ta2 ta2Var = new ta2(oe4Var, tc0Var, f92Var);
        sa2 sa2Var = ei2.b;
        knc.b(context);
        return new qu1(ra2Var, ta2Var, new ei2(new hp9(knc.a().c(new d41(ei2.c, ei2.d)).a("FIREBASE_CRASHLYTICS_REPORT", new bt3("json"), ei2.e), tc0Var.b(), s26Var2)), s6fVar, oe4Var2, al5Var, ij1Var);
    }

    public static int[] q() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = s(255, i3, i4, i5);
            } else {
                int i7 = i6 & 1;
                int i8 = Token.SWITCH;
                if (i7 != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i8 = 0;
                }
                iArr[i6] = s(255, i, i2, i8);
            }
        }
        return iArr;
    }

    public static int[] r() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = s(63, i17, i18, i20);
            } else {
                int i21 = i19 & Token.WITH;
                int i22 = 170;
                int i23 = 85;
                if (i21 != 0) {
                    if (i21 != 8) {
                        int i24 = 43;
                        if (i21 != 128) {
                            if (i21 == 136) {
                                if ((i19 & 1) != 0) {
                                    i13 = 43;
                                } else {
                                    i13 = 0;
                                }
                                if ((i19 & 16) != 0) {
                                    i14 = 85;
                                } else {
                                    i14 = 0;
                                }
                                int i25 = i13 + i14;
                                if ((i19 & 2) != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if ((i19 & 32) != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                int i26 = i15 + i16;
                                if ((i19 & 4) == 0) {
                                    i24 = 0;
                                }
                                if ((i19 & 64) == 0) {
                                    i23 = 0;
                                }
                                iArr[i19] = s(255, i25, i26, i24 + i23);
                            }
                        } else {
                            if ((i19 & 1) != 0) {
                                i9 = 43;
                            } else {
                                i9 = 0;
                            }
                            int i27 = i9 + Token.SWITCH;
                            if ((i19 & 16) != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i27 + i10;
                            if ((i19 & 2) != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i11 + Token.SWITCH;
                            if ((i19 & 32) != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i29 + i12;
                            if ((i19 & 4) == 0) {
                                i24 = 0;
                            }
                            int i31 = i24 + Token.SWITCH;
                            if ((i19 & 64) == 0) {
                                i23 = 0;
                            }
                            iArr[i19] = s(255, i28, i30, i31 + i23);
                        }
                    } else {
                        if ((i19 & 1) != 0) {
                            i5 = 85;
                        } else {
                            i5 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i6 = 170;
                        } else {
                            i6 = 0;
                        }
                        int i32 = i5 + i6;
                        if ((i19 & 2) != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        int i33 = i7 + i8;
                        if ((i19 & 4) == 0) {
                            i23 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i22 = 0;
                        }
                        iArr[i19] = s(Token.SWITCH, i32, i33, i23 + i22);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i34 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i35 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = s(255, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    public static int s(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static List t(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new cb0(str, str2));
                } else {
                    xk5.k("Null value");
                    return null;
                }
            } else {
                xk5.k("Null key");
                return null;
            }
        }
        Collections.sort(arrayList, new uk(22));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu1.v(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static bm3 w(ea1 ea1Var, int i) {
        int[] iArr;
        int g;
        int i2;
        int g2;
        int g3;
        int i3;
        int i4 = 8;
        int g4 = ea1Var.g(8);
        ea1Var.o(8);
        int i5 = 2;
        int i6 = i - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] q = q();
        int[] r = r();
        while (i6 > 0) {
            int g5 = ea1Var.g(i4);
            int g6 = ea1Var.g(i4);
            if ((g6 & Token.CASE) != 0) {
                iArr = iArr2;
            } else if ((g6 & 64) != 0) {
                iArr = q;
            } else {
                iArr = r;
            }
            if ((g6 & 1) != 0) {
                g3 = ea1Var.g(i4);
                i3 = ea1Var.g(i4);
                g = ea1Var.g(i4);
                g2 = ea1Var.g(i4);
                i2 = i6 - 6;
            } else {
                int g7 = ea1Var.g(4) << 4;
                g = ea1Var.g(4) << 4;
                i2 = i6 - 4;
                g2 = ea1Var.g(i5) << 6;
                g3 = ea1Var.g(6) << i5;
                i3 = g7;
            }
            if (g3 == 0) {
                i3 = i7;
                g = i3;
                g2 = 255;
            }
            double d = g3;
            double d2 = i3 - 128;
            double d3 = g - 128;
            iArr[g5] = s((byte) (255 - (g2 & 255)), a2d.i((int) ((1.402d * d2) + d), 0, 255), a2d.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), a2d.i((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i2;
            i7 = 0;
            g4 = g4;
            r = r;
            i4 = 8;
            i5 = 2;
        }
        return new bm3(g4, iArr2, q, r);
    }

    public static dm3 x(ea1 ea1Var) {
        byte[] bArr;
        int g = ea1Var.g(16);
        ea1Var.o(4);
        int g2 = ea1Var.g(2);
        boolean f = ea1Var.f();
        ea1Var.o(1);
        byte[] bArr2 = a2d.b;
        if (g2 == 1) {
            ea1Var.o(ea1Var.g(8) * 16);
        } else if (g2 == 0) {
            int g3 = ea1Var.g(16);
            int g4 = ea1Var.g(16);
            if (g3 > 0) {
                bArr2 = new byte[g3];
                ea1Var.j(bArr2, g3);
            }
            if (g4 > 0) {
                bArr = new byte[g4];
                ea1Var.j(bArr, g4);
                return new dm3(g, f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new dm3(g, f, bArr2, bArr);
    }

    public ArrayList A(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pt1 pt1Var = (pt1) obj;
            if (pt1Var.e == 0) {
                l99 l99Var = (l99) ((HashMap) this.a).get(pt1Var);
                for (mf9 mf9Var : pt1Var.b) {
                    if (!hashMap.containsKey(mf9Var)) {
                        hashMap.put(mf9Var, l99Var);
                    } else {
                        arrayList2.add(new b9(13, (ve8) ((l99) hashMap.get(mf9Var)), l99Var));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, sj6] */
    public ArrayList B() {
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            pt1 pt1Var = (pt1) entry.getKey();
            if (pt1Var.e != 0) {
                l99 l99Var = (l99) entry.getValue();
                for (mf9 mf9Var : pt1Var.b) {
                    if (!hashMap2.containsKey(mf9Var)) {
                        hashMap2.put(mf9Var, new HashSet());
                    }
                    ((Set) hashMap2.get(mf9Var)).add(l99Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((mf9) entry2.getKey(), obj);
            } else {
                sj6 sj6Var = (sj6) hashMap.get(entry2.getKey());
                for (l99 l99Var2 : (Set) entry2.getValue()) {
                    arrayList.add(new b9(14, sj6Var, l99Var2));
                }
            }
        }
        return arrayList;
    }

    public Task C(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList b = ((ta2) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            File file = (File) b.get(i);
            try {
                sa2 sa2Var = ta2.g;
                String e = ta2.e(file);
                sa2Var.getClass();
                arrayList.add(new ya0(sa2.i(e), file.getName(), file));
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            ya0 ya0Var = (ya0) obj;
            if (str == null || str.equals(ya0Var.b)) {
                ei2 ei2Var = (ei2) this.c;
                xa0 xa0Var = ya0Var.a;
                boolean z = true;
                if (xa0Var.f == null || xa0Var.g == null) {
                    eg4 b2 = ((al5) this.f).b(true);
                    xa0 xa0Var2 = ya0Var.a;
                    String str2 = b2.a;
                    wa0 a = xa0Var2.a();
                    a.e = str2;
                    xa0 a2 = a.a();
                    String str3 = b2.b;
                    wa0 a3 = a2.a();
                    a3.f = str3;
                    ya0Var = new ya0(a3.a(), ya0Var.b, ya0Var.c);
                }
                if (str == null) {
                    z = false;
                }
                hp9 hp9Var = ei2Var.a;
                synchronized (hp9Var.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z) {
                            ((AtomicInteger) hp9Var.i.b).getAndIncrement();
                            if (hp9Var.f.size() < hp9Var.e) {
                                ox9 ox9Var = ox9.E;
                                ox9Var.n("Enqueueing report: " + ya0Var.b);
                                ox9Var.n("Queue size: " + hp9Var.f.size());
                                hp9Var.g.execute(new gp9(0, hp9Var, ya0Var, taskCompletionSource));
                                ox9Var.n("Closing task for report: " + ya0Var.b);
                                taskCompletionSource.trySetResult(ya0Var);
                            } else {
                                hp9Var.a();
                                String str4 = "Dropping report due to queue being full: " + ya0Var.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) hp9Var.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(ya0Var);
                            }
                        } else {
                            hp9Var.b(ya0Var, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new p1a(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public bm1 D() {
        if (((bm1) this.C) == null) {
            qf4 qf4Var = (qf4) this.e;
            qf4Var.a();
            this.C = new bm1(qf4Var.a, qf4Var, "X" + Integer.toString(((r95) this.d).b));
        }
        return (bm1) this.C;
    }

    @Override // defpackage.du1
    public synchronized l99 d(mf9 mf9Var) {
        sj6 sj6Var = (sj6) ((HashMap) this.c).get(mf9Var);
        if (sj6Var != null) {
            return sj6Var;
        }
        return D;
    }

    @Override // defpackage.du1
    public ve8 e(mf9 mf9Var) {
        l99 g = g(mf9Var);
        if (g == null) {
            return new ve8(ve8.c, ve8.d);
        }
        if (g instanceof ve8) {
            return (ve8) g;
        }
        return new ve8(null, g);
    }

    @Override // defpackage.du1
    public synchronized l99 g(mf9 mf9Var) {
        oc2.v(mf9Var, "Null interface requested.");
        return (l99) ((HashMap) this.b).get(mf9Var);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [tc0, java.lang.Object] */
    @Override // defpackage.k99
    public Object get() {
        tw8 tw8Var = new tw8(7);
        jf8 jf8Var = new jf8(7);
        ?? obj = new Object();
        obj.a = (Context) ((k99) this.a).get();
        obj.b = (ub7) ((k99) this.b).get();
        obj.c = (hw9) ((k99) this.c).get();
        obj.d = (zg4) ((yx9) this.d).get();
        obj.e = (Executor) ((k99) this.e).get();
        obj.f = (hw9) ((k99) this.f).get();
        obj.g = tw8Var;
        obj.h = jf8Var;
        obj.i = (hw9) ((k99) this.C).get();
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x024b, code lost:
        if ((r3.b + 1) == ((android.graphics.Bitmap) r43.C).getHeight()) goto L91;
     */
    @Override // defpackage.o8b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(byte[] r44, int r45, int r46, defpackage.n8b r47, defpackage.h12 r48) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu1.k(byte[], int, int, n8b, h12):void");
    }

    @Override // defpackage.o8b
    public int m() {
        return 2;
    }

    public void p(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            l99 l99Var = (l99) entry.getValue();
            int i = ((pt1) entry.getKey()).d;
            if (i == 1 || (i == 2 && z)) {
                l99Var.get();
            }
        }
        hx3 hx3Var = (hx3) this.e;
        synchronized (hx3Var) {
            try {
                arrayDeque = hx3Var.b;
                if (arrayDeque != null) {
                    hx3Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw rs8.f(it);
            }
        }
    }

    @Override // defpackage.o8b
    public void reset() {
        hm3 hm3Var = (hm3) this.f;
        hm3Var.c.clear();
        hm3Var.d.clear();
        hm3Var.e.clear();
        hm3Var.f.clear();
        hm3Var.g.clear();
        hm3Var.h = null;
        hm3Var.i = null;
    }

    public void u(boolean z) {
        HashMap hashMap;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap((HashMap) this.a);
        }
        p(hashMap, z);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, lb0] */
    public void y(Throwable th, Thread thread, String str, tx3 tx3Var, boolean z) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean equals = str.equals("crash");
        ra2 ra2Var = (ra2) this.a;
        long j = tx3Var.b;
        Context context = ra2Var.a;
        int i = context.getResources().getConfiguration().orientation;
        s26 s26Var = ra2Var.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        Boolean bool = null;
        oaa oaaVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            oaaVar = new oaa(th3.getLocalizedMessage(), th3.getClass().getName(), s26Var.d(th3.getStackTrace()), oaaVar, 28);
        }
        oaa oaaVar2 = oaaVar;
        ?? obj = new Object();
        obj.b = str;
        obj.a = j;
        boolean z2 = true;
        obj.g = (byte) (obj.g | 1);
        fa2 b = p69.a.b(context);
        int i2 = ((wb0) b).c;
        if (i2 > 0) {
            if (i2 == 100) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        }
        Boolean bool2 = bool;
        ArrayList a = p69.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) oaaVar2.d;
        String name = thread.getName();
        if (name != null) {
            List d = ra2.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new sb0(4, name, d));
                if (z) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] d2 = s26Var.d(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d3 = ra2.d(d2, 0);
                                if (d3 != null) {
                                    arrayList.add(new sb0(0, name2, d3));
                                } else {
                                    xk5.k("Null frames");
                                    return;
                                }
                            } else {
                                xk5.k("Null name");
                                return;
                            }
                        } else {
                            it = it2;
                        }
                        it2 = it;
                    }
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                qb0 c = ra2.c(oaaVar2, 0);
                rb0 e = ra2.e();
                List a2 = ra2Var.a();
                if (a2 != null) {
                    obj.c = new nb0(new ob0(unmodifiableList, c, null, e, a2), null, null, bool2, b, a, i);
                    obj.d = ra2Var.b(i);
                    mb0 a3 = obj.a();
                    Map map = tx3Var.c;
                    oe4 oe4Var = (oe4) this.e;
                    ma2 j2 = j(i(a3, (s6f) this.d, oe4Var, map), oe4Var);
                    if (!z) {
                        ((wa2) ((ij1) this.C).c).a(new a04(this, j2, tx3Var, equals));
                        return;
                    } else {
                        ((ta2) this.b).d(j2, tx3Var.a, equals);
                        return;
                    }
                }
                xk5.k("Null binaries");
                return;
            }
            xk5.k("Null frames");
            return;
        }
        xk5.k("Null name");
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, sj6] */
    public void z() {
        boolean z;
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (pt1 pt1Var : ((HashMap) this.a).keySet()) {
            for (x13 x13Var : pt1Var.c) {
                if (x13Var.b == 2) {
                    z = true;
                } else {
                    z = false;
                }
                mf9 mf9Var = x13Var.a;
                if (z && !hashMap2.containsKey(mf9Var)) {
                    ?? obj = new Object();
                    obj.b = null;
                    obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.a.addAll(Collections.EMPTY_SET);
                    hashMap2.put(mf9Var, obj);
                } else if (hashMap.containsKey(mf9Var)) {
                    continue;
                } else {
                    int i = x13Var.b;
                    if (i != 1) {
                        if (i != 2) {
                            hashMap.put(mf9Var, new ve8(ve8.c, ve8.d));
                        }
                    } else {
                        throw new gt1("Unsatisfied dependency for component " + pt1Var + ": " + mf9Var, 2);
                    }
                }
            }
        }
    }

    public qu1(qf4 qf4Var, r95 r95Var) {
        this.e = qf4Var;
        qf4Var.a();
        String str = qf4Var.c.a;
        this.f = str;
        qf4Var.a();
        qf4Var.c.getClass();
        this.d = r95Var;
        this.c = null;
        this.a = null;
        this.b = null;
        String G2 = zr1.G("firebear.secureToken");
        if (TextUtils.isEmpty(G2)) {
            yz yzVar = q2e.a;
            synchronized (yzVar) {
                if (yzVar.get(str) != null) {
                    throw new ClassCastException();
                }
            }
            G2 = "https://".concat("securetoken.googleapis.com/v1");
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + G2);
        }
        if (((h1e) this.c) == null) {
            this.c = new l4(D(), G2, 3);
        }
        String G3 = zr1.G("firebear.identityToolkit");
        if (TextUtils.isEmpty(G3)) {
            G3 = q2e.b(str);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + G3);
        }
        if (((h1e) this.a) == null) {
            this.a = new l4(D(), G3, 3);
        }
        String G4 = zr1.G("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(G4)) {
            yz yzVar2 = q2e.a;
            synchronized (yzVar2) {
                if (yzVar2.get(str) != null) {
                    throw new ClassCastException();
                }
            }
            G4 = "https://".concat("identitytoolkit.googleapis.com/v2");
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + G4);
        }
        if (((h1e) this.b) == null) {
            this.b = new l4(D(), G4, 3);
        }
        ((e0e) qf4Var.b(e0e.class)).getClass();
        yz yzVar3 = q2e.b;
        synchronized (yzVar3) {
            try {
                if (yzVar3.containsKey(str)) {
                    ((List) yzVar3.get(str)).add(new WeakReference(this));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(this));
                    yzVar3.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ qu1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.C = obj7;
    }

    public qu1(List list) {
        km8 km8Var = new km8((byte[]) list.get(0));
        int G2 = km8Var.G();
        int G3 = km8Var.G();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new cm3(719, 575, 0, 719, 0, 575);
        this.e = new bm3(0, new int[]{0, -1, -16777216, -8421505}, q(), r());
        this.f = new hm3(G2, G3);
    }

    public qu1(Context context, xy1 xy1Var, omd omdVar, v69 v69Var, WorkDatabase workDatabase, ymd ymdVar, ArrayList arrayList) {
        context.getClass();
        v69Var.getClass();
        this.a = xy1Var;
        this.b = omdVar;
        this.c = v69Var;
        this.d = workDatabase;
        this.e = ymdVar;
        this.f = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.C = applicationContext;
        new gq4();
    }
}
