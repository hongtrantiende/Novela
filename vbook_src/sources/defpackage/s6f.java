package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s6f  reason: default package */
/* loaded from: classes.dex */
public final class s6f implements d7f, wkb, dw9, t38, fk9, zl8, gg2, ar3, an8 {
    public static final lh9 c = new lh9(28);
    public Object a;
    public Object b;

    public s6f(int i) {
        switch (i) {
            case 19:
                this.a = new b5d(true);
                this.b = new b5d(true);
                return;
            case 20:
            case 21:
            default:
                this.a = ByteBuffer.allocateDirect(500);
                return;
            case 22:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                return;
            case 23:
                this.a = new AtomicReference(fs5.b);
                this.b = new ij1(27, false);
                return;
        }
    }

    public static s6f Q(ogf ogfVar) {
        return new s6f(ogfVar, k7f.c(ogfVar.B()));
    }

    public void A(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.A(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void B(rr4 rr4Var, Bundle bundle, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.B(rr4Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void C(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.C(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void D(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.D(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void E(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.E(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public byte[] F(sx3 sx3Var) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(sx3Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(sx3Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(sx3Var.c);
            dataOutputStream.writeLong(sx3Var.d);
            dataOutputStream.write(sx3Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            fb4.l(e);
            return null;
        }
    }

    public void G() {
        String str = (String) this.a;
        if (((FileChannel) this.b) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.b = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.b;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.b = null;
                throw new IllegalStateException(hl5.n("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    public void H(int i, Bundle bundle) {
        bd bdVar;
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bdVar = (ij1) this.a;
            } else {
                bdVar = (mu9) this.b;
            }
            if (bdVar != null) {
                bdVar.j(string, bundle2);
            }
        }
    }

    public void I(hp4 hp4Var) {
        aq9 aq9Var = (aq9) this.b;
        k57 k57Var = (k57) this.a;
        int i = hp4Var.b;
        if (i == 0) {
            aq9Var.execute(new bv4(2, k57Var, hp4Var.a));
        } else {
            aq9Var.execute(new t51(k57Var, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
        if (((defpackage.w35) r18.b).b(r1) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.xe8 J(defpackage.jp5 r19, defpackage.cna r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6f.J(jp5, cna):xe8");
    }

    public Object K(long j, long j2, Map map, mab mabVar, o0 o0Var) {
        y78 y78Var = new y78(dye.A(j));
        drc drcVar = fca.k;
        lq lqVar = new lq(y78Var, drcVar, null, 12);
        this.b = lqVar;
        long j3 = ((y78) drcVar.b.invoke(new gs(z78.b(j2), z78.c(j2)))).a;
        Object obj = map.get("density");
        obj.getClass();
        Object p = k27.p(new hg1(lqVar, j3, (r13) obj, mabVar, (m42) null), o0Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vv1
            if (r0 == 0) goto L13
            r0 = r5
            vv1 r0 = (defpackage.vv1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vv1 r0 = new vv1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L28
            int r4 = r0.a
            defpackage.hre.r(r5)
            goto L51
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2f:
            defpackage.hre.r(r5)
            java.lang.Object r4 = r4.a
            lq r4 = (defpackage.lq) r4
            if (r4 == 0) goto L40
            boolean r5 = r4.f()
            if (r5 != r3) goto L40
            r5 = r3
            goto L41
        L40:
            r5 = r2
        L41:
            if (r5 == 0) goto L52
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = r4.h(r0)
            n82 r0 = defpackage.n82.a
            if (r4 != r0) goto L50
            return r0
        L50:
            r4 = r5
        L51:
            r5 = r4
        L52:
            if (r5 == 0) goto L55
            r2 = r3
        L55:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6f.L(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wv1
            if (r0 == 0) goto L13
            r0 = r5
            wv1 r0 = (defpackage.wv1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wv1 r0 = new wv1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L28
            int r4 = r0.a
            defpackage.hre.r(r5)
            goto L51
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2f:
            defpackage.hre.r(r5)
            java.lang.Object r4 = r4.b
            lq r4 = (defpackage.lq) r4
            if (r4 == 0) goto L40
            boolean r5 = r4.f()
            if (r5 != r3) goto L40
            r5 = r3
            goto L41
        L40:
            r5 = r2
        L41:
            if (r5 == 0) goto L52
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = r4.h(r0)
            n82 r0 = defpackage.n82.a
            if (r4 != r0) goto L50
            return r0
        L50:
            r4 = r5
        L51:
            r5 = r4
        L52:
            if (r5 == 0) goto L55
            r2 = r3
        L55:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6f.M(n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [qoc, com.google.common.util.concurrent.ListenableFuture, x1, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [gca, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.concurrent.Executor, java.lang.Object, java.util.concurrent.atomic.AtomicReference, ty3] */
    public ListenableFuture N(x00 x00Var, Executor executor) {
        executor.getClass();
        ?? atomicReference = new AtomicReference(sy3.a);
        atomicReference.b = executor;
        atomicReference.a = this;
        kw5 kw5Var = new kw5(22, (Object) atomicReference, x00Var);
        ?? obj = new Object();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.a).getAndSet(obj);
        ?? obj2 = new Object();
        obj2.E = new poc((qoc) obj2, kw5Var);
        listenableFuture.a(obj2, atomicReference);
        ListenableFuture d = dv4.d(obj2);
        pj0 pj0Var = new pj0((qoc) obj2, (gca) obj, listenableFuture, d, (ty3) atomicReference);
        e73 e73Var = e73.a;
        d.a(pj0Var, e73Var);
        obj2.a(pj0Var, e73Var);
        return d;
    }

    public xe8 O(xe8 xe8Var) {
        boolean z;
        w94 w94Var = xe8Var.j;
        u4 u4Var = op5.b;
        if (h50.s((Bitmap.Config) fca.k(xe8Var, u4Var)) && !((w35) this.b).g()) {
            w94Var.getClass();
            LinkedHashMap z2 = o17.z(w94Var.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                z2.put(u4Var, config);
            } else {
                z2.remove(u4Var);
            }
            w94Var = new w94(que.x(z2));
            z = true;
        } else {
            z = false;
        }
        w94 w94Var2 = w94Var;
        if (z) {
            return new xe8(xe8Var.a, xe8Var.b, xe8Var.c, xe8Var.d, xe8Var.e, xe8Var.f, xe8Var.g, xe8Var.h, xe8Var.i, w94Var2);
        }
        return xe8Var;
    }

    public void P(ArrayList arrayList) {
        x78 x78Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((w78) arrayList.get(i)).a == 1) {
                try {
                    x78Var = new x78((w78) arrayList.get(i));
                } catch (v78 unused) {
                    x78Var = null;
                }
                this.b = x78Var;
            }
        }
    }

    @Override // defpackage.t38
    public void a(y28 y28Var, int i) {
        if ((y28Var instanceof cp3) && ((oaa) ((mce) this.b).a).F(((cp3) y28Var).e.b)) {
            cp3 cp3Var = ((cp3) this.a).a;
            if (cp3Var == null) {
                cp3Var = null;
            }
            cp3Var.getClass();
            this.a = cp3Var;
        }
    }

    @Override // defpackage.zl8
    public Object b(gi1 gi1Var, ArrayList arrayList) {
        Object gs9Var;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class B = nmd.B(gi1Var);
        Object obj = concurrentHashMap.get(B);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(B, (obj = new yl8()))) != null) {
            obj = putIfAbsent;
        }
        yl8 yl8Var = (yl8) obj;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new x76((t76) obj2));
        }
        ConcurrentHashMap concurrentHashMap2 = yl8Var.a;
        Object obj3 = concurrentHashMap2.get(arrayList2);
        if (obj3 == null) {
            try {
                gs9Var = (s76) ((lu4) this.a).invoke(gi1Var, arrayList);
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            hs9 hs9Var = new hs9(gs9Var);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, hs9Var);
            if (putIfAbsent2 == null) {
                obj3 = hs9Var;
            } else {
                obj3 = putIfAbsent2;
            }
        }
        return ((hs9) obj3).a;
    }

    @Override // defpackage.ar3
    public Object e() {
        return (owc) this.a;
    }

    @Override // defpackage.fk9
    public u16 f(ek9 ek9Var, Object obj) {
        u16 u16Var;
        ux1 ux1Var = (ux1) this.a;
        if (ux1Var == null) {
            ux1Var = null;
        }
        u16 u16Var2 = u16.a;
        if (ux1Var == null || (u16Var = ux1Var.f(ek9Var, obj)) == null) {
            u16Var = u16Var2;
        }
        if (u16Var == u16Var2) {
            ls7 ls7Var = (ls7) this.b;
            ls7Var.f = sl1.o0(ls7Var.f, new yk8(ek9Var, obj));
            return u16.b;
        }
        return u16Var;
    }

    @Override // defpackage.wkb
    public void g(ml5 ml5Var) {
        vk8 vk8Var;
        vk8 l;
        jp5 jp5Var = (jp5) this.a;
        n10 n10Var = (n10) this.b;
        if (ml5Var != null) {
            vk8Var = hxe.f(ml5Var, jp5Var.a, n10Var.L);
        } else {
            vk8Var = null;
        }
        if (vk8Var == null && ((Boolean) fca.j(jp5Var, np5.a)).booleanValue() && (l = n10Var.l()) != null) {
            vk8Var = l;
        }
        n10.k(n10Var, new k10(vk8Var));
    }

    @Override // defpackage.gg2
    public jg2 h() {
        return new gt2((Context) this.a, ((cw) this.b).h());
    }

    @Override // defpackage.ar3
    public boolean i(CharSequence charSequence, int i, int i2, xsc xscVar) {
        Spannable spannableString;
        if ((xscVar.c & 4) > 0) {
            return true;
        }
        if (((owc) this.a) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.a = new owc(spannableString);
        }
        ((r0f) this.b).getClass();
        ((owc) this.a).setSpan(new ysc(xscVar), i, i2, 33);
        return true;
    }

    public jub j(List list) {
        un3 un3Var;
        Exception e;
        long a;
        un3 un3Var2;
        fxb fxbVar = null;
        try {
            int size = list.size();
            int i = 0;
            un3Var = null;
            while (i < size) {
                try {
                    un3Var2 = (un3) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    un3Var2.a((lu0) this.b);
                    i++;
                    un3Var = un3Var2;
                } catch (Exception e3) {
                    e = e3;
                    un3Var = un3Var2;
                    StringBuilder sb = new StringBuilder();
                    int e4 = ((cw) ((lu0) this.b).f).e();
                    fxb d = ((lu0) this.b).d();
                    lu0 lu0Var = (lu0) this.b;
                    sb.append("Error while applying EditCommand batch to buffer (length=" + e4 + ", composition=" + d + ", selection=" + fxb.i(sze.a(lu0Var.b, lu0Var.c)) + "):");
                    sb.append('\n');
                    sl1.h0(list, sb, "\n", new cq2(un3Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            lu0 lu0Var2 = (lu0) this.b;
            lu0Var2.getClass();
            ps psVar = new ps(((cw) lu0Var2.f).toString());
            lu0 lu0Var3 = (lu0) this.b;
            long a2 = sze.a(lu0Var3.b, lu0Var3.c);
            fxb fxbVar2 = new fxb(a2);
            if (!fxb.h(((jub) this.a).b)) {
                fxbVar = fxbVar2;
            }
            if (fxbVar != null) {
                a = fxbVar.a;
            } else {
                a = sze.a(fxb.f(a2), fxb.g(a2));
            }
            jub jubVar = new jub(psVar, a, ((lu0) this.b).d());
            this.a = jubVar;
            return jubVar;
        } catch (Exception e5) {
            un3Var = null;
            e = e5;
        }
    }

    public void k() {
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.an8
    public Object l(Uri uri, lg2 lg2Var) {
        df4 df4Var = (df4) ((an8) this.a).l(uri, lg2Var);
        List list = (List) this.b;
        if (list != null && !list.isEmpty()) {
            return (df4) df4Var.a(list);
        }
        return df4Var;
    }

    public boolean m(int i) {
        return ((ci4) this.a).a.get(i);
    }

    public void n() {
        String str = (String) this.a;
        try {
            oe4 oe4Var = (oe4) this.b;
            oe4Var.getClass();
            new File((File) oe4Var.d, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:67:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:67:0x00b4 }] */
    @Override // defpackage.dw9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cw9 o(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6f.o(java.lang.String):cw9");
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [wf2, java.lang.Object] */
    public ei0[] p(Handler handler, c04 c04Var, c04 c04Var2, c04 c04Var3, c04 c04Var4) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.a;
        s47 s47Var = new s47(context);
        lv2 lv2Var = (lv2) this.b;
        s47Var.c = lv2Var;
        s47Var.d = 5000L;
        s47Var.e = handler;
        s47Var.f = c04Var;
        s47Var.g = 50;
        wq9.D(!s47Var.b);
        Handler handler2 = s47Var.e;
        if ((handler2 == null && s47Var.f == null) || (handler2 != null && s47Var.f != null)) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        s47Var.b = true;
        arrayList.add(new u47(s47Var));
        ?? obj = new Object();
        obj.b = context;
        r40 r40Var = r40.f;
        wq9.D(!obj.a);
        obj.a = true;
        if (((ij1) obj.c) == null) {
            obj.c = new ij1(new y50[0]);
        }
        r60 r60Var = (r60) obj.e;
        os2 os2Var = (os2) obj.f;
        if (r60Var == null) {
            if (os2Var == null) {
                obj.f = new os2(context);
            }
            if (((j55) obj.d) == null) {
                obj.d = j55.d;
            }
            q60 q60Var = new q60(context);
            Context context2 = (Context) q60Var.b;
            if (context2 == null) {
                q60Var.e = null;
            }
            os2 os2Var2 = (os2) obj.f;
            q60Var.c = os2Var2;
            q60Var.d = (j55) obj.d;
            if (os2Var2 == null) {
                q60Var.c = new os2(context2);
            }
            obj.e = new r60(q60Var);
        } else {
            if (os2Var == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            wq9.D(z2);
            if (((j55) obj.d) == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            wq9.D(z3);
        }
        arrayList.add(new e47(context, lv2Var, handler, c04Var2, new vs2(obj)));
        arrayList.add(new hxb(c04Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new yb7(c04Var4, looper));
        }
        arrayList.add(new w51());
        arrayList.add(new vo5(new ej(context, 1)));
        return (ei0[]) arrayList.toArray(new ei0[0]);
    }

    public void q(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.q(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void r(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        hs4 hs4Var = (hs4) this.a;
        ur4 ur4Var = hs4Var.w.d;
        rr4 rr4Var2 = hs4Var.y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.r(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void s(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.s(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void t(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.t(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, al6, y28] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, al6, y28] */
    @Override // defpackage.t38
    public void v(y28 y28Var, int i) {
        int l;
        oaa oaaVar = (oaa) ((mce) this.b).a;
        if (y28Var instanceof cp3) {
            cp3 cp3Var = (cp3) y28Var;
            if (oaaVar.F(cp3Var.e.b)) {
                cp3 Y = cp3Var.Y();
                String str = cp3Var.e.a;
                j40 e = Y.e();
                Y.L();
                i40 i40Var = new i40(cp3Var.e());
                while (i40Var.hasNext()) {
                    g40 g40Var = (g40) i40Var.next();
                    if (oaaVar.E(str, cp3Var, g40Var)) {
                        e.n(g40Var.a, g40Var.getValue());
                        g40Var.c = e;
                    }
                }
                j40 y = oaaVar.y(str);
                if (cp3Var.r("a") && y.g("rel").equals("nofollow")) {
                    String a = cp3Var.a("href");
                    String f = cp3Var.f();
                    if (a.length() != 0 && f.length() != 0 && r4b.Q(a, f, false) && (l = y.l("rel")) != -1) {
                        y.p(l);
                    }
                }
                e.a(y);
                Y.e().a(e);
                ((cp3) this.a).H(Y);
                this.a = Y;
            }
        } else if (y28Var instanceof fwb) {
            String H = ((fwb) y28Var).H();
            ?? obj = new Object();
            obj.d = H;
            ((cp3) this.a).H(obj);
        } else if (y28Var instanceof cg2) {
            cg2 cg2Var = (cg2) y28Var;
            cp3 cp3Var2 = cg2Var.a;
            cp3Var2.getClass();
            if (oaaVar.F(cp3Var2.e.b)) {
                String H2 = cg2Var.H();
                ?? obj2 = new Object();
                obj2.d = H2;
                ((cp3) this.a).H(obj2);
            }
        }
    }

    public void w(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.w(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void x(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.x(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void y(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        hs4 hs4Var = (hs4) this.a;
        ur4 ur4Var = hs4Var.w.d;
        rr4 rr4Var2 = hs4Var.y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.y(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    public void z(rr4 rr4Var, boolean z) {
        rr4Var.getClass();
        rr4 rr4Var2 = ((hs4) this.a).y;
        if (rr4Var2 != null) {
            rr4Var2.o().o.z(rr4Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z) {
                    throw null;
                }
                throw null;
            }
            vm1.h();
        }
    }

    @Override // defpackage.fk9
    public void c() {
    }

    @Override // defpackage.fk9
    public void d(Object obj) {
    }

    public s6f(String str, hud hudVar, tn3 tn3Var) {
        this.b = str;
        this.a = hudVar;
    }

    public s6f(ogf ogfVar, hlf hlfVar) {
        this.b = ogfVar;
        this.a = hlfVar;
    }

    public s6f(oe4 oe4Var) {
        this.a = oe4Var;
        this.b = c;
    }

    public s6f(cu9 cu9Var, dw9 dw9Var) {
        dw9Var.getClass();
        this.b = cu9Var;
        this.a = dw9Var;
    }

    public /* synthetic */ s6f(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public s6f(Context context, cw cwVar) {
        this.a = context.getApplicationContext();
        this.b = cwVar;
    }

    public s6f(lu4 lu4Var) {
        this.a = lu4Var;
        this.b = new ConcurrentHashMap();
    }
}
