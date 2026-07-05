package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xtc  reason: default package */
/* loaded from: classes3.dex */
public final class xtc {
    public static final vyc k = obe.o("http://localhost").b();
    public String a;
    public boolean b;
    public int c;
    public ztc d;
    public String e;
    public String f;
    public String g;
    public List h;
    public vl8 i;
    public xyc j;

    /* JADX WARN: Type inference failed for: r1v4, types: [vl8, c3e] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ly0, java.lang.Object] */
    public xtc() {
        tl8.b.getClass();
        ns3 ns3Var = sl8.b;
        ns3Var.getClass();
        this.a = "";
        this.b = false;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        Set set = xk1.a;
        Charset charset = ed1.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        newEncoder.getClass();
        int length = "".length();
        ?? obj = new Object();
        p17.c(newEncoder, obj, "", 0, length);
        xk1.f(obj, new wk1(0, sb));
        this.g = sb.toString();
        this.h = new ArrayList(tl1.s(ks3.a, 10));
        ?? c3eVar = new c3e(8);
        xoe.f(c3eVar, ns3Var);
        this.i = c3eVar;
        this.j = new xyc(c3eVar);
    }

    public final void a() {
        if (this.a.length() <= 0 && !d().a.equals("file")) {
            vyc vycVar = k;
            this.a = vycVar.a;
            if (this.d == null) {
                this.d = vycVar.D;
            }
            if (this.c == 0) {
                e(vycVar.b);
            }
        }
    }

    public final vyc b() {
        String str;
        a();
        ztc ztcVar = this.d;
        String str2 = this.a;
        int i = this.c;
        List<String> list = this.h;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (String str3 : list) {
            arrayList.add(xk1.c(str3));
        }
        tl8 j = xoe.j(this.j.a);
        String d = xk1.d(0, this.g, 0, 15);
        String str4 = this.e;
        String str5 = null;
        if (str4 != null) {
            str = xk1.c(str4);
        } else {
            str = null;
        }
        String str6 = this.f;
        if (str6 != null) {
            str5 = xk1.c(str6);
        }
        return new vyc(ztcVar, str2, i, arrayList, j, d, str, str5, this.b, c());
    }

    public final String c() {
        a();
        StringBuilder sb = new StringBuilder(256);
        jbe.i(this, sb);
        return sb.toString();
    }

    public final ztc d() {
        ztc ztcVar = this.d;
        if (ztcVar == null) {
            ztc ztcVar2 = ztc.c;
            return ztc.c;
        }
        return ztcVar;
    }

    public final void e(int i) {
        if (i >= 0 && i < 65536) {
            this.c = i;
        } else {
            p1a.k(a82.j(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        jbe.i(this, sb);
        return sb.toString();
    }
}
