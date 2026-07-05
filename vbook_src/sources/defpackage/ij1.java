package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.vbook.android.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ij1  reason: default package */
/* loaded from: classes.dex */
public final class ij1 implements jf5, js6, wqa, bd, ad, rfd, a6 {
    public static volatile ij1 e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object f = new Object();
    public static final e92 C = new e92(0);
    public static final uk D = new uk(6);
    public static final xa2 E = new Object();
    public static final cy5 F = new cy5(-9223372036854775807L, 0, false);
    public static final cy5 G = new cy5(-9223372036854775807L, 2, false);
    public static final cy5 H = new cy5(-9223372036854775807L, 3, false);
    public static final ij1 I = new ij1(5, (Object) null, (Object) null, (Object) null);
    public static final byte[] J = new byte[0];

    /* JADX WARN: Type inference failed for: r3v1, types: [vsb, java.lang.Object] */
    public ij1(int i) {
        this.a = i;
        switch (i) {
            case 10:
                ?? obj = new Object();
                obj.a = Float.NaN;
                this.b = obj;
                this.c = new Object();
                return;
            case 11:
                this.b = k27.a(rse.b());
                this.c = new sw7();
                this.d = new LinkedHashMap();
                qq9.a.add(this);
                return;
            case 12:
                this.b = new ypa(16);
                long[] jArr = tz9.a;
                this.c = new tv7();
                this.d = new v28(5);
                return;
            case 24:
                this.b = new uwd(17);
                this.c = new uwd(17);
                this.d = new uwd(17);
                return;
            case 28:
                this.b = new tv7();
                return;
            default:
                this.d = new v28(5);
                return;
        }
    }

    public static ij1 C(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new ij1(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static void Q(oe4 oe4Var, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                oe4Var.c(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
            }
        }
    }

    public static final void n() {
        if (!((Boolean) new v7(0, E, xa2.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 12).invoke()).booleanValue()) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static final void p() {
        if (!((Boolean) new v7(0, E, xa2.class, "isBlockingThread", "isBlockingThread()Z", 0, 13).invoke()).booleanValue()) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static ij1 r(ij1 ij1Var, i38 i38Var, fvb fvbVar, ai6 ai6Var, int i) {
        Object obj = i38Var;
        if ((i & 1) != 0) {
            obj = (sc6) ij1Var.b;
        }
        if ((i & 2) != 0) {
            fvbVar = (fvb) ij1Var.c;
        }
        if ((i & 4) != 0) {
            ai6Var = (ai6) ij1Var.d;
        }
        return new ij1(5, obj, fvbVar, ai6Var);
    }

    public static boolean s(Editable editable, KeyEvent keyEvent, boolean z) {
        ysc[] yscVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yscVarArr = (ysc[]) editable.getSpans(selectionStart, selectionEnd, ysc.class)) != null && yscVarArr.length > 0) {
                for (ysc yscVar : yscVarArr) {
                    int spanStart = editable.getSpanStart(yscVar);
                    int spanEnd = editable.getSpanEnd(yscVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public long A() {
        tt2 tt2Var = (tt2) this.d;
        if (tt2Var != null) {
            return tt2Var.d;
        }
        return -1L;
    }

    public r13 B() {
        return ((n61) this.d).a.a;
    }

    public tc6 D() {
        return ((n61) this.d).a.b;
    }

    public int E(int i) {
        zg1 zg1Var = (zg1) this.c;
        if (i >= 0) {
            int childCount = ((RecyclerView) ((g99) this.b).b).getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                int A = i - (i2 - zg1Var.A(i2));
                if (A == 0) {
                    while (zg1Var.E(i2)) {
                        i2++;
                    }
                    return i2;
                }
                i2 += A;
            }
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|(1:(1:(1:(1:(6:12|13|14|(1:18)|20|21)(2:26|27))(6:28|29|30|(1:34)|36|37))(6:41|42|43|44|(6:46|29|30|(2:32|34)|36|37)|47))(1:52))(3:74|(1:76)|47)|53|54|(8:56|(1:58)|59|60|61|62|(3:64|44|(0))|47)|69|59|60|61|62|(0)|47))|77|6|(0)(0)|53|54|(0)|69|59|60|61|62|(0)|47|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010b, code lost:
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
        if (r3.o(r4) == r11) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:28:0x0093, B:30:0x009b, B:36:0x00bd, B:35:0x00a7), top: B:79:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(java.lang.String r17, defpackage.xt4 r18, defpackage.n42 r19) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.F(java.lang.String, xt4, n42):java.lang.Object");
    }

    public long G() {
        return ((n61) this.d).a.d;
    }

    public View H(int i) {
        return ((RecyclerView) ((g99) this.b).b).getChildAt(i);
    }

    public int I() {
        return ((RecyclerView) ((g99) this.b).b).getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [m48, c3e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean J() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.J():boolean");
    }

    public boolean K() {
        if (((IOException) this.d) != null) {
            return true;
        }
        return false;
    }

    public boolean L(CharSequence charSequence, int i, int i2, xsc xscVar) {
        int i3;
        if ((xscVar.c & 3) == 0) {
            zt2 zt2Var = (zt2) this.d;
            wb7 b = xscVar.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            zt2Var.getClass();
            ThreadLocal threadLocal = zt2.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = zt2Var.a.hasGlyph(sb.toString());
            int i4 = xscVar.c & 4;
            if (hasGlyph) {
                i3 = i4 | 2;
            } else {
                i3 = i4 | 1;
            }
            xscVar.c = i3;
        }
        if ((xscVar.c & 3) != 2) {
            return false;
        }
        return true;
    }

    public void M(View view) {
        ((ArrayList) this.d).add(view);
        g99 g99Var = (g99) this.b;
        rl9 F2 = RecyclerView.F(view);
        if (F2 != null) {
            View view2 = F2.a;
            RecyclerView recyclerView = (RecyclerView) g99Var.b;
            int i = F2.p;
            if (i != -1) {
                F2.o = i;
            } else {
                Field field = rcd.a;
                F2.o = view2.getImportantForAccessibility();
            }
            if (recyclerView.I()) {
                F2.p = 4;
                recyclerView.M0.add(F2);
                return;
            }
            Field field2 = rcd.a;
            view2.setImportantForAccessibility(4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r1.d != r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r1.d != r11) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(defpackage.jg2 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.b89 r15) {
        /*
            r7 = this;
            tt2 r1 = new tt2
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.d = r1
            java.lang.Object r8 = r7.c
            r94 r8 = (defpackage.r94) r8
            if (r8 == 0) goto L11
            return
        L11:
            java.lang.Object r8 = r7.b
            u94 r8 = (defpackage.u94) r8
            r94[] r8 = r8.d(r9, r10)
            int r10 = r8.length
            ls5 r10 = defpackage.qs5.j(r10)
            int r11 = r8.length
            r12 = 1
            r13 = 0
            if (r11 != r12) goto L29
            r8 = r8[r13]
            r7.c = r8
            goto L84
        L29:
            int r11 = r8.length
            r14 = r13
        L2b:
            if (r14 >= r11) goto L7e
            r0 = r8[r14]
            boolean r2 = r0.c(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            if (r2 == 0) goto L3d
            r7.c = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r1.f = r13
            goto L7e
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5a
        L3d:
            java.util.List r0 = r0.e()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r10.c(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            java.lang.Object r0 = r7.c
            r94 r0 = (defpackage.r94) r0
            if (r0 != 0) goto L53
            long r5 = r1.d
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r13
            goto L54
        L53:
            r0 = r12
        L54:
            defpackage.wq9.D(r0)
            r1.f = r13
            goto L7b
        L5a:
            java.lang.Object r7 = r7.c
            r94 r7 = (defpackage.r94) r7
            if (r7 != 0) goto L68
            long r9 = r1.d
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 != 0) goto L67
            goto L68
        L67:
            r12 = r13
        L68:
            defpackage.wq9.D(r12)
            r1.f = r13
            throw r8
        L6e:
            java.lang.Object r0 = r7.c
            r94 r0 = (defpackage.r94) r0
            if (r0 != 0) goto L53
            long r5 = r1.d
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7b:
            int r14 = r14 + 1
            goto L2b
        L7e:
            java.lang.Object r11 = r7.c
            r94 r11 = (defpackage.r94) r11
            if (r11 == 0) goto L8c
        L84:
            java.lang.Object r7 = r7.c
            r94 r7 = (defpackage.r94) r7
            r7.f(r15)
            return
        L8c:
            qwc r7 = new qwc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            lie r12 = new lie
            r14 = 2
            java.lang.String r15 = ", "
            r12.<init>(r15, r14)
            mm9 r8 = defpackage.qs5.m(r8)
            uz0 r14 = new uz0
            r14.<init>(r13)
            java.util.AbstractList r8 = defpackage.uue.F(r8, r14)
            java.lang.String r8 = r12.b(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            mm9 r9 = r10.g()
            r7.<init>(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.N(jg2, android.net.Uri, java.util.Map, long, long, b89):void");
    }

    public boolean O() {
        if (((fs6) this.c) != null) {
            return true;
        }
        return false;
    }

    public boolean P() {
        boolean z;
        if (((msa) ((uwd) this.b).b).isEmpty() && ((msa) ((uwd) this.d).b).isEmpty() && ((msa) ((uwd) this.c).b).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public Object R(CharSequence charSequence, int i, int i2, int i3, boolean z, ar3 ar3Var) {
        int i4;
        zb7 zb7Var;
        boolean z2;
        cr3 cr3Var = new cr3((zb7) ((oaa) this.c).d);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z3 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = ((zb7) cr3Var.f).a;
                if (sparseArray == null) {
                    zb7Var = null;
                } else {
                    zb7Var = (zb7) sparseArray.get(codePointAt);
                }
                if (cr3Var.b != 2) {
                    if (zb7Var == null) {
                        cr3Var.a();
                        z2 = true;
                    } else {
                        cr3Var.b = 2;
                        cr3Var.f = zb7Var;
                        cr3Var.d = 1;
                        z2 = true;
                    }
                } else {
                    if (zb7Var != null) {
                        cr3Var.f = zb7Var;
                        cr3Var.d++;
                    } else {
                        if (codePointAt == 65038) {
                            cr3Var.a();
                        } else if (codePointAt != 65039) {
                            zb7 zb7Var2 = (zb7) cr3Var.f;
                            if (zb7Var2.b != null) {
                                if (cr3Var.d == 1) {
                                    if (cr3Var.b()) {
                                        cr3Var.g = (zb7) cr3Var.f;
                                        cr3Var.a();
                                    } else {
                                        cr3Var.a();
                                    }
                                } else {
                                    cr3Var.g = zb7Var2;
                                    cr3Var.a();
                                }
                                z2 = true;
                            } else {
                                cr3Var.a();
                            }
                        }
                        z2 = true;
                    }
                    z2 = true;
                }
                cr3Var.c = codePointAt;
                if (!z2) {
                    if (!z2) {
                        if (z2) {
                            if (z || !L(charSequence, i4, i6, ((zb7) cr3Var.g).b)) {
                                z3 = ar3Var.i(charSequence, i4, i6, ((zb7) cr3Var.g).b);
                                i5++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i6;
                        if (charCount < i2) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i6 = charCount;
                    }
                } else {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                }
            }
        }
        if (cr3Var.b == 2 && ((zb7) cr3Var.f).b != null && ((cr3Var.d > 1 || cr3Var.b()) && i5 < i3 && z3 && (z || !L(charSequence, i4, i6, ((zb7) cr3Var.f).b)))) {
            ar3Var.i(charSequence, i4, i6, ((zb7) cr3Var.f).b);
        }
        return ar3Var.e();
    }

    public void S(hs6 hs6Var) {
        dr7 dr7Var = (dr7) this.b;
        fs6 fs6Var = (fs6) this.c;
        if (fs6Var != null) {
            fs6Var.a(true);
        }
        if (hs6Var != null) {
            dr7Var.execute(new og(hs6Var, 7));
        }
        ((xk5) dr7Var.c).accept(dr7Var.b);
    }

    public void T(nc ncVar) {
        a09 a09Var = (a09) ((HashMap) this.b).remove(ncVar);
        a09Var.getClass();
        iv2 iv2Var = (iv2) ((jv2) this.d).p.get(a09Var);
        if (iv2Var != null) {
            synchronized (iv2Var) {
                iv2Var.d--;
            }
        }
    }

    public void U(String str) {
        if (str != null) {
            this.b = str;
        } else {
            xk5.k("Null backendName");
        }
    }

    public void V(k61 k61Var) {
        ((n61) this.d).a.c = k61Var;
    }

    public void W(r13 r13Var) {
        ((n61) this.d).a.a = r13Var;
    }

    public void X(tc6 tc6Var) {
        ((n61) this.d).a.b = tc6Var;
    }

    public void Y(long j) {
        ((n61) this.d).a.d = j;
    }

    public void Z(gs6 gs6Var, es6 es6Var, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.d = null;
        fs6 fs6Var = new fs6(this, myLooper, gs6Var, es6Var, i, SystemClock.elapsedRealtime());
        if (((fs6) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        this.c = fs6Var;
        fs6Var.b();
    }

    public void a(od6 od6Var, s16 s16Var) {
        uwd uwdVar = (uwd) this.b;
        uwd uwdVar2 = (uwd) this.c;
        uwd uwdVar3 = (uwd) this.d;
        int ordinal = s16Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (od6Var.E != null) {
                            uwdVar3.n(od6Var);
                            return;
                        } else {
                            uwdVar2.n(od6Var);
                            return;
                        }
                    }
                    xk5.o();
                    return;
                } else if (od6Var.E != null) {
                    uwdVar3.n(od6Var);
                    return;
                } else {
                    uwdVar.n(od6Var);
                    return;
                }
            }
            uwdVar2.n(od6Var);
            uwdVar3.n(od6Var);
            return;
        }
        uwdVar.n(od6Var);
        uwdVar3.n(od6Var);
    }

    public void a0(View view) {
        if (((ArrayList) this.d).remove(view)) {
            g99 g99Var = (g99) this.b;
            rl9 F2 = RecyclerView.F(view);
            if (F2 != null) {
                RecyclerView recyclerView = (RecyclerView) g99Var.b;
                int i = F2.o;
                if (recyclerView.I()) {
                    F2.p = i;
                    recyclerView.M0.add(F2);
                } else {
                    View view2 = F2.a;
                    Field field = rcd.a;
                    view2.setImportantForAccessibility(i);
                }
                F2.o = 0;
            }
        }
    }

    @Override // defpackage.js6
    public void b() {
        IOException iOException = (IOException) this.d;
        if (iOException == null) {
            fs6 fs6Var = (fs6) this.c;
            if (fs6Var != null) {
                int i = fs6Var.a;
                IOException iOException2 = fs6Var.e;
                if (iOException2 != null && fs6Var.f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public void c(View view, int i, boolean z) {
        int E2;
        RecyclerView recyclerView = (RecyclerView) ((g99) this.b).b;
        if (i < 0) {
            E2 = recyclerView.getChildCount();
        } else {
            E2 = E(i);
        }
        ((zg1) this.c).G(E2, z);
        if (z) {
            M(view);
        }
        recyclerView.addView(view, E2);
        RecyclerView.F(view);
    }

    @Override // defpackage.jf5
    public void d(Object obj, re5 re5Var) {
        jj1 jj1Var = (jj1) obj;
        jj1Var.getClass();
        re5Var.getClass();
        hj1 hj1Var = new hj1(jj1Var.a, re5Var, jj1Var.b);
        jj1Var.c.invoke(hj1Var);
        jj1Var.d = hj1Var.d;
        ArrayList arrayList = hj1Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            k95 k95Var = (k95) obj2;
            k95Var.getClass();
            k95Var.a.q(re5Var, k95Var.b);
        }
    }

    @Override // defpackage.a6
    public void e(Object obj) {
        uw2.o((AtomicBoolean) this.c, (zl9) this.d);
        f61 f61Var = (f61) this.b;
        if (f61Var.t() instanceof f48) {
            f61Var.resumeWith(obj);
        }
    }

    @Override // defpackage.jf5
    public Object f(xt4 xt4Var) {
        Object invoke = ((vt4) this.b).invoke();
        xt4Var.invoke(invoke);
        return new jj1((h40) this.d, invoke, (xt4) this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // defpackage.rfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(defpackage.vyc r5, java.lang.String r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ke2
            if (r0 == 0) goto L13
            r0 = r7
            ke2 r0 = (defpackage.ke2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ke2 r0 = new ke2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L64
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            java.lang.String r5 = r5.C
            android.content.Intent r7 = new android.content.Intent
            java.lang.Object r1 = r4.b
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity> r3 = org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity.class
            r7.<init>(r1, r3)
            java.lang.String r1 = "url"
            r7.putExtra(r1, r5)
            java.lang.Object r5 = r4.d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "package"
            r7.putExtra(r1, r5)
            java.lang.String r5 = "redirecturl"
            r7.putExtra(r5, r6)
            java.lang.String r5 = "ephemeral_session"
            r6 = 0
            r7.putExtra(r5, r6)
            java.lang.Object r4 = r4.c
            k6 r4 = (defpackage.k6) r4
            r0.c = r2
            java.lang.Object r7 = r4.c(r7, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L64
            return r4
        L64:
            z5 r7 = (defpackage.z5) r7
            ufd r4 = defpackage.ape.x(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.g(vyc, java.lang.String, n42):java.lang.Object");
    }

    @Override // defpackage.jf5
    public h40 getKey() {
        return (h40) this.d;
    }

    @Override // defpackage.wqa
    public float h(float f2, float f3) {
        return nae.e;
    }

    @Override // defpackage.ad
    public void i(Bundle bundle) {
        synchronized (this.c) {
            try {
                ox9 ox9Var = ox9.E;
                ox9Var.A("Logging event _ae to Firebase Analytics with params " + bundle);
                this.d = new CountDownLatch(1);
                ((fz4) this.b).i(bundle);
                ox9Var.A("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.d).await(500L, TimeUnit.MILLISECONDS)) {
                        ox9Var.A("App exception callback received from Analytics listener.");
                    } else {
                        ox9Var.D("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bd
    public void j(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void k(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int E2;
        RecyclerView recyclerView = (RecyclerView) ((g99) this.b).b;
        if (i < 0) {
            E2 = recyclerView.getChildCount();
        } else {
            E2 = E(i);
        }
        ((zg1) this.c).G(E2, z);
        if (z) {
            M(view);
        }
        rl9 F2 = RecyclerView.F(view);
        if (F2 != null) {
            if (!F2.i() && !F2.n()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(F2);
                vs.l(sb, recyclerView.w());
                return;
            }
            F2.i &= -257;
        }
        recyclerView.attachViewToParent(view, E2, layoutParams);
    }

    public ld0 l() {
        String str;
        if (((String) this.b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((c69) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new ld0((String) this.b, (byte[]) this.c, (c69) this.d);
        }
        vs.k("Missing required properties:".concat(str));
        return null;
    }

    public void m() {
        fs6 fs6Var = (fs6) this.c;
        fs6Var.getClass();
        fs6Var.a(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r8 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r8 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        r10 = r4;
     */
    @Override // defpackage.wqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float o(float r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            qe r0 = (defpackage.qe) r0
            float r1 = r0.d()
            jt2 r2 = r0.b()
            java.lang.Object r3 = r10.c
            xt4 r3 = (defpackage.xt4) r3
            java.lang.Object r10 = r10.d
            od r10 = (defpackage.od) r10
            boolean r4 = java.lang.Float.isNaN(r1)
            r5 = 0
            if (r4 != 0) goto Lae
            float r4 = java.lang.Math.abs(r11)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r4 <= 0) goto L27
            r4 = r7
            goto L28
        L27:
            r4 = r6
        L28:
            if (r4 == 0) goto L30
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 <= 0) goto L30
            r8 = r7
            goto L31
        L30:
            r8 = r6
        L31:
            if (r4 != 0) goto L3b
            java.lang.Object r10 = r2.a(r1)
            r10.getClass()
            goto La0
        L3b:
            float r11 = java.lang.Math.abs(r11)
            java.lang.Object r10 = r10.invoke()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 < 0) goto L59
            java.lang.Object r10 = r2.b(r1, r8)
            r10.getClass()
            goto La0
        L59:
            java.lang.Object r10 = r2.b(r1, r6)
            r10.getClass()
            float r11 = r2.c(r10)
            java.lang.Object r4 = r2.b(r1, r7)
            r4.getClass()
            float r2 = r2.c(r4)
            float r9 = r11 - r2
            float r9 = java.lang.Math.abs(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r3 = r3.invoke(r9)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = java.lang.Math.abs(r3)
            if (r8 == 0) goto L8a
            goto L8b
        L8a:
            r11 = r2
        L8b:
            float r11 = r11 - r1
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 < 0) goto L95
            r6 = r7
        L95:
            if (r6 != r7) goto L9a
            if (r8 == 0) goto La0
            goto L9f
        L9a:
            if (r6 != 0) goto Laa
            if (r8 == 0) goto L9f
            goto La0
        L9f:
            r10 = r4
        La0:
            jt2 r11 = r0.b()
            float r10 = r11.c(r10)
            float r10 = r10 - r1
            return r10
        Laa:
            defpackage.xk5.o()
            return r5
        Lae:
            java.lang.String r10 = "The offset provided to computeTarget must not be NaN."
            defpackage.vs.m(r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.o(float):float");
    }

    public boolean q(od6 od6Var) {
        boolean z;
        boolean z2;
        if (od6Var.E == null) {
            z = true;
        } else {
            z = false;
        }
        if (!((msa) ((uwd) this.b).b).contains(od6Var) && !((msa) ((uwd) this.c).b).contains(od6Var)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2) {
            return false;
        }
        return true;
    }

    public void t(int i) {
        rl9 F2;
        int E2 = E(i);
        ((zg1) this.c).I(E2);
        RecyclerView recyclerView = (RecyclerView) ((g99) this.b).b;
        View childAt = recyclerView.getChildAt(E2);
        if (childAt != null && (F2 = RecyclerView.F(childAt)) != null) {
            if (F2.i() && !F2.n()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(F2);
                vs.l(sb, recyclerView.w());
                return;
            }
            F2.a(256);
        }
        recyclerView.detachViewFromParent(E2);
    }

    public String toString() {
        switch (this.a) {
            case 18:
                return ((zg1) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (gv5.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    v((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new gt1(9, e2);
            }
        }
    }

    public Object v(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (sxd.l()) {
            try {
                Trace.beginSection(sxd.o(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                gv5 gv5Var = (gv5) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = gv5Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            v(cls2, hashSet);
                        }
                    }
                }
                obj = gv5Var.b((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public k61 w() {
        return ((n61) this.d).a.c;
    }

    public View x(int i) {
        return ((RecyclerView) ((g99) this.b).b).getChildAt(E(i));
    }

    public int y() {
        return ((RecyclerView) ((g99) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public ov6 z() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((v28) this.d)) {
            try {
                ov6 ov6Var = (ov6) this.c;
                if (ov6Var != null && localeList == ((LocaleList) this.b)) {
                    return ov6Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new nv6(localeList.get(i)));
                }
                ov6 ov6Var2 = new ov6(arrayList);
                this.b = localeList;
                this.c = ov6Var2;
                return ov6Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ ij1(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ ij1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public ij1(Context context, k6 k6Var, String str) {
        this.a = 21;
        context.getClass();
        k6Var.getClass();
        this.b = context;
        this.c = k6Var;
        this.d = str;
    }

    public ij1(byte[] bArr, byte[] bArr2, BigInteger bigInteger, x0f x0fVar) {
        this.a = 6;
        this.d = BigInteger.ZERO;
        this.c = bigInteger;
        this.b = x0fVar;
    }

    public ij1(ExecutorService executorService, ExecutorService executorService2) {
        this.a = 3;
        executorService.getClass();
        executorService2.getClass();
        this.b = new wa2(executorService);
        this.c = new wa2(executorService);
        Tasks.forResult(null);
        this.d = new wa2(executorService2);
    }

    public /* synthetic */ ij1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ij1(fz4 fz4Var) {
        this.a = 14;
        this.c = new Object();
        this.b = fz4Var;
    }

    public ij1(g99 g99Var) {
        this.a = 18;
        this.b = g99Var;
        this.c = new zg1();
        this.d = new ArrayList();
    }

    public ij1(oe4 oe4Var) {
        this.a = 2;
        this.c = null;
        this.d = null;
        this.b = oe4Var;
    }

    public ij1(FirebaseMessagingService firebaseMessagingService, fz4 fz4Var, ExecutorService executorService) {
        this.a = 25;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = fz4Var;
    }

    public ij1(String str, vt4 vt4Var, xt4 xt4Var) {
        nsc nscVar;
        this.a = 0;
        vt4Var.getClass();
        this.b = vt4Var;
        this.c = xt4Var;
        gi1 a = cm9.a(jj1.class);
        try {
            w76 w76Var = w76.c;
            gi1 a2 = cm9.a(ij1.class);
            cm9.a.getClass();
            ksc kscVar = new ksc(a2);
            cm9.c(kscVar, cm9.d(Object.class));
            List list = Collections.EMPTY_LIST;
            list.getClass();
            nscVar = cm9.e(jj1.class, v9e.y(new nsc(kscVar, list, 0)));
        } catch (Throwable unused) {
            nscVar = null;
        }
        this.d = new h40(str, new isc(a, nscVar));
    }

    public ij1(n61 n61Var) {
        this.a = 16;
        this.d = n61Var;
        this.b = new mu9(this);
    }

    public ij1(Context context) {
        this.a = 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public ij1(oaa oaaVar, r0f r0fVar, zt2 zt2Var, Set set) {
        this.a = 26;
        this.b = r0fVar;
        this.c = oaaVar;
        this.d = zt2Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            R(str, 0, str.length(), 1, true, new zhe(str, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lsa] */
    public ij1(y50[] y50VarArr) {
        this.a = 22;
        ila ilaVar = new ila();
        ?? obj = new Object();
        obj.c = 1.0f;
        obj.d = 1.0f;
        v50 v50Var = v50.e;
        obj.e = v50Var;
        obj.f = v50Var;
        obj.g = v50Var;
        obj.h = v50Var;
        ByteBuffer byteBuffer = y50.a;
        obj.k = byteBuffer;
        obj.l = byteBuffer;
        obj.b = -1;
        y50[] y50VarArr2 = new y50[y50VarArr.length + 2];
        this.b = y50VarArr2;
        System.arraycopy(y50VarArr, 0, y50VarArr2, 0, y50VarArr.length);
        this.c = ilaVar;
        this.d = obj;
        y50VarArr2[y50VarArr.length] = ilaVar;
        y50VarArr2[y50VarArr.length + 1] = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ij1(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 4
            r4.a = r0
            java.lang.String r1 = "ExoPlayer:Loader:"
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = defpackage.a2d.a
            py1 r1 = new py1
            r2 = 1
            r1.<init>(r5, r2)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            xk5 r1 = new xk5
            r1.<init>()
            dr7 r3 = new dr7
            r3.<init>(r5, r1, r2)
            r4.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.<init>(java.lang.String):void");
    }

    public ij1(jv2 jv2Var, a09 a09Var) {
        this.a = 23;
        this.d = jv2Var;
        this.b = new HashMap();
        this.c = a09Var;
    }
}
