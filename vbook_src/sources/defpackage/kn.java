package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kn  reason: default package */
/* loaded from: classes.dex */
public final class kn implements yr5 {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public kn(i04 i04Var, c04 c04Var, xfb xfbVar, int i, int i2, int i3, int i4) {
        this.a = 3;
        this.b = i04Var;
        this.d = c04Var;
        this.e = xfbVar;
        this.f = new y9c();
        this.C = xfbVar.a(i04Var.s, new nr6(this, 1));
        this.D = new c5b(this, i);
        this.E = new d5b(this, i2);
        this.F = new e5b(this, i3);
        this.G = new f5b(this, i4);
        b5b b5bVar = new b5b(this);
        this.c = b5bVar;
        i04Var.m.a(b5bVar);
    }

    public static final void c(kn knVar, mq7 mq7Var, i38 i38Var) {
        wv5 wv5Var;
        for (mq7 mq7Var2 = mq7Var.e; mq7Var2 != null; mq7Var2 = mq7Var2.e) {
            if (mq7Var2 == ((b38) knVar.c)) {
                od6 v = ((od6) knVar.b).v();
                if (v != null) {
                    wv5Var = (wv5) v.c0.d;
                } else {
                    wv5Var = null;
                }
                i38Var.S = wv5Var;
                knVar.e = i38Var;
                return;
            } else if ((mq7Var2.c & 2) == 0) {
                mq7Var2.G1(i38Var);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mq7, tg0] */
    public static mq7 g(lq7 lq7Var, mq7 mq7Var) {
        mq7 mq7Var2;
        if (lq7Var instanceof uq7) {
            mq7Var2 = ((uq7) lq7Var).b();
            mq7Var2.c = o38.f(mq7Var2);
        } else {
            ?? mq7Var3 = new mq7();
            mq7Var3.c = o38.d(lq7Var);
            mq7Var3.K = lq7Var;
            mq7Var3.L = new HashSet();
            mq7Var2 = mq7Var3;
        }
        if (mq7Var2.J) {
            lv5.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        mq7Var2.E = true;
        mq7 mq7Var4 = mq7Var.f;
        if (mq7Var4 != null) {
            mq7Var4.e = mq7Var2;
            mq7Var2.f = mq7Var4;
        }
        mq7Var.f = mq7Var2;
        mq7Var2.e = mq7Var;
        return mq7Var2;
    }

    public static mq7 h(mq7 mq7Var) {
        boolean z = mq7Var.J;
        if (z) {
            gv7 gv7Var = o38.a;
            if (!z) {
                lv5.c("autoInvalidateRemovedNode called on unattached node");
            }
            o38.a(mq7Var, -1, 2);
            mq7Var.E1();
            mq7Var.y1();
        }
        mq7 mq7Var2 = mq7Var.f;
        mq7 mq7Var3 = mq7Var.e;
        if (mq7Var2 != null) {
            mq7Var2.e = mq7Var3;
            mq7Var.f = null;
        }
        if (mq7Var3 != null) {
            mq7Var3.f = mq7Var2;
            mq7Var.e = null;
        }
        mq7Var3.getClass();
        return mq7Var3;
    }

    public static void n(lq7 lq7Var, lq7 lq7Var2, mq7 mq7Var) {
        if ((lq7Var instanceof uq7) && (lq7Var2 instanceof uq7)) {
            mq7Var.getClass();
            ((uq7) lq7Var2).d(mq7Var);
            if (mq7Var.J) {
                o38.c(mq7Var);
            } else {
                mq7Var.F = true;
            }
        } else if (mq7Var instanceof tg0) {
            tg0 tg0Var = (tg0) mq7Var;
            boolean z = tg0Var.J;
            if (z) {
                if (!z) {
                    lv5.c("unInitializeModifier called on unattached node");
                }
                if ((tg0Var.c & 8) != 0) {
                    ((rg) voe.w(tg0Var)).B();
                }
            }
            tg0Var.K = lq7Var2;
            tg0Var.c = o38.d(lq7Var2);
            if (tg0Var.J) {
                tg0Var.H1(false);
            }
            if (mq7Var.J) {
                o38.c(mq7Var);
            } else {
                mq7Var.F = true;
            }
        } else {
            lv5.c("Unknown Modifier.Node type");
        }
    }

    @Override // defpackage.yr5
    public int a() {
        return ((vdf) this.c).a();
    }

    @Override // defpackage.yr5
    public long b(long j) {
        return ((vdf) this.b).b(j);
    }

    @Override // defpackage.yr5
    public long d(long j) {
        return ((vdf) this.b).d(j);
    }

    public void e(String str, String str2) {
        HashMap hashMap = (HashMap) this.C;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            vs.k("Property \"autoMetadata\" has not been set");
        }
    }

    public jc0 f() {
        String str;
        if (((String) this.b) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((us3) this.d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.f) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.C) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new jc0((String) this.b, (Integer) this.c, (us3) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (HashMap) this.C, (Integer) this.D, (String) this.E, (byte[]) this.F, (byte[]) this.G);
        }
        vs.k("Missing required properties:".concat(str));
        return null;
    }

    public void i(xt4 xt4Var) {
        vdf vdfVar = (vdf) this.b;
        vdfVar.b++;
        ((gw7) vdfVar.e).b(xt4Var);
        vdfVar.e();
    }

    public boolean j(int i) {
        if ((((mq7) this.C).d & i) != 0) {
            return true;
        }
        return false;
    }

    public void k() {
        for (mq7 mq7Var = (mq7) this.C; mq7Var != null; mq7Var = mq7Var.f) {
            mq7Var.D1();
            if (mq7Var.E) {
                gv7 gv7Var = o38.a;
                if (!mq7Var.J) {
                    lv5.c("autoInvalidateInsertedNode called on unattached node");
                }
                o38.a(mq7Var, -1, 1);
            }
            if (mq7Var.F) {
                o38.c(mq7Var);
            }
            mq7Var.E = false;
            mq7Var.F = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
        if ((r19 & 1) != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
        if (r13 > r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
        if (r13 == r12) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
        if (r13 == r3) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
        if (r3 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
        if (r14 != r11) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
        if (r14 <= r7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
        if (r11 <= r15) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (r0.a(r14 - 1, r27 - 1) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
        if (r24 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
        if (r11 < r12) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
        if (r11 > r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
        if (r16[r17 + r11] < r14) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r32, defpackage.gw7 r33, defpackage.gw7 r34, defpackage.mq7 r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn.l(int, gw7, gw7, mq7, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m() {
        wv5 wv5Var;
        wv5 wv5Var2;
        od6 od6Var = (od6) this.b;
        wv5 wv5Var3 = (wv5) this.d;
        for (mq7 mq7Var = ((hkb) this.f).e; mq7Var != null; mq7Var = mq7Var.e) {
            fd6 j = voe.j(mq7Var);
            if (j != null) {
                i38 i38Var = mq7Var.D;
                if (i38Var != null) {
                    id6 id6Var = (id6) i38Var;
                    fd6 fd6Var = id6Var.u0;
                    id6Var.h2(j);
                    wv5Var2 = id6Var;
                    if (fd6Var != mq7Var) {
                        vg8 vg8Var = id6Var.n0;
                        wv5Var2 = id6Var;
                        if (vg8Var != null) {
                            ((s15) vg8Var).c();
                            wv5Var2 = id6Var;
                        }
                    }
                } else {
                    i38 id6Var2 = new id6(od6Var, j);
                    mq7Var.G1(id6Var2);
                    wv5Var2 = id6Var2;
                }
                wv5Var3.S = wv5Var2;
                wv5Var2.R = wv5Var3;
                wv5Var3 = wv5Var2;
            } else {
                mq7Var.G1(wv5Var3);
            }
        }
        od6 v = od6Var.v();
        if (v != null) {
            wv5Var = (wv5) v.c0.d;
        } else {
            wv5Var = null;
        }
        wv5Var3.S = wv5Var;
        this.e = wv5Var3;
    }

    public ListenableFuture o(b7f b7fVar, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.E) {
            ListenableFuture listenableFuture2 = (ListenableFuture) this.G;
            if (listenableFuture2 != null && listenableFuture2.isDone()) {
                try {
                    dv4.b((ListenableFuture) this.G);
                } catch (ExecutionException unused) {
                    this.G = null;
                }
            }
            if (((ListenableFuture) this.G) == null) {
                this.G = dv4.d(((s6f) this.F).N(khf.a(new g99(this, 25)), (n9a) this.e));
            }
            listenableFuture = (ListenableFuture) this.G;
        }
        return ((s6f) this.F).N(khf.a(new odd(this, listenableFuture, b7fVar, executor, 19)), e73.a);
    }

    public hzd p(Uri uri) {
        bef befVar = (bef) this.d;
        String str = (String) this.b;
        b9f b9fVar = (b9f) this.f;
        try {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                String sb2 = sb.toString();
                ((bl8) this.D).getClass();
                dgf f = bl8.f(sb2);
                try {
                    InputStream u = r1d.u(b9fVar.b(uri));
                    o0e a = ((n0e) ((f2e) befVar.a.s(7))).a(u, befVar.b);
                    if (u != null) {
                        u.close();
                    }
                    f.close();
                    return a;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                x8f b = b9fVar.b(uri);
                if (!b.a.b(b.d)) {
                    return befVar.a;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw jqe.L(b9fVar, uri, e2, str);
        }
    }

    public void q(Uri uri, Object obj) {
        String str = (String) this.b;
        b9f b9fVar = (b9f) this.f;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String sb2 = sb.toString();
            ((bl8) this.D).getClass();
            dgf f = bl8.f(sb2);
            rwa rwaVar = new rwa(29, false);
            try {
                x8f b = b9fVar.b(build);
                ArrayList a = b.a(b.a.d(b.d));
                new rwa[]{rwaVar}[0].A(a);
                OutputStream outputStream = (OutputStream) a.get(0);
                try {
                    ((hzd) obj).b(outputStream);
                    if (((haf) rwaVar.c) != null) {
                        ((OutputStream) rwaVar.b).flush();
                        ((haf) rwaVar.c).a.getFD().sync();
                        outputStream.close();
                        f.close();
                        x8f b2 = b9fVar.b(build);
                        x8f b3 = b9fVar.b(uri);
                        ebf ebfVar = b2.a;
                        if (ebfVar == b3.a) {
                            ebfVar.f(b2.d, b3.d);
                            return;
                        }
                        throw new IOException("Cannot rename file across backends");
                    }
                    throw new IOException("Cannot sync underlying stream");
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw jqe.L(b9fVar, uri, e, str);
            }
        } catch (IOException e2) {
            x8f b4 = b9fVar.b(build);
            if (b4.a.b(b4.d)) {
                try {
                    x8f b5 = b9fVar.b(build);
                    b5.a.e(b5.d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[");
                mq7 mq7Var = (mq7) this.C;
                hkb hkbVar = (hkb) this.f;
                if (mq7Var == hkbVar) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (mq7Var != null && mq7Var != hkbVar) {
                            sb.append(String.valueOf(mq7Var));
                            if (mq7Var.f == hkbVar) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                mq7Var = mq7Var.f;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public kn(String str, fs5 fs5Var, bef befVar, Executor executor, b9f b9fVar, d59 d59Var, bl8 bl8Var) {
        this.a = 4;
        this.E = new Object();
        this.F = new s6f(23);
        this.G = null;
        this.b = str;
        this.c = dv4.d(fs5Var);
        this.d = befVar;
        this.e = new n9a(executor);
        this.f = b9fVar;
        this.C = d59Var;
        this.D = bl8Var;
    }

    public kn(od6 od6Var) {
        this.a = 2;
        this.b = od6Var;
        mq7 mq7Var = new mq7();
        mq7Var.d = -1;
        this.c = mq7Var;
        wv5 wv5Var = new wv5(od6Var);
        this.d = wv5Var;
        this.e = wv5Var;
        hkb hkbVar = wv5Var.u0;
        this.f = hkbVar;
        this.C = hkbVar;
        this.F = new gw7(new nq7[16], 0);
    }

    public /* synthetic */ kn() {
        this.a = 1;
    }

    public kn(vdf vdfVar, mkc mkcVar, kw5 kw5Var, xt4 xt4Var, ce2 ce2Var, hvb hvbVar, vt4 vt4Var, ucd ucdVar, xt4 xt4Var2) {
        this.a = 0;
        this.c = vdfVar;
        this.d = mkcVar;
        this.e = kw5Var;
        this.f = xt4Var;
        this.D = ce2Var;
        this.E = hvbVar;
        this.F = vt4Var;
        this.G = ucdVar;
        this.C = xt4Var2;
        this.b = vdfVar;
    }
}
