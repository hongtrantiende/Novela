package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z5f  reason: default package */
/* loaded from: classes.dex */
public final class z5f {
    public static final j23 i = new j23(1);
    public static final x4f j;
    public volatile vz0 a;
    public final a0f b;
    public final String c;
    public final String d;
    public final boolean e;
    public final ts5 f;
    public final bp9 g;
    public final q7f h;

    static {
        k3e k3eVar = k3e.c;
        int i2 = ts5.c;
        j = new x4f(k3eVar, false, tm9.F);
    }

    public z5f(a0f a0fVar, x4f x4fVar) {
        this.b = a0fVar;
        Context context = a0fVar.b;
        String str = x4fVar.d;
        if (str == null) {
            str = (String) x4fVar.a.apply(context);
            x4fVar.d = str;
        }
        this.c = str;
        this.d = "";
        this.e = x4fVar.b;
        this.f = x4fVar.c;
        this.a = null;
        this.g = new bp9();
        this.h = new q7f(a0fVar, str);
    }

    public final vz0 a() {
        vz0 vz0Var;
        vz0 vz0Var2 = this.a;
        if (vz0Var2 == null) {
            synchronized (this) {
                try {
                    vz0Var = this.a;
                    if (vz0Var == null) {
                        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        vz0 a = this.h.a();
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        int i2 = ((vf9) a.e).c - 2;
                        if (i2 != 15 && i2 != 16) {
                            a0f a0fVar = this.b;
                            a0fVar.g.a();
                            if (!this.e && !this.h.b() && ((String) a.b).isEmpty()) {
                                a0fVar.a().execute(new Runnable(this) { // from class: b5f
                                    public final /* synthetic */ z5f b;

                                    {
                                        this.b = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        a0f a0fVar2;
                                        int i3;
                                        o3f o3fVar;
                                        obf obfVar;
                                        int i4;
                                        abf abfVar;
                                        String substring;
                                        boolean z;
                                        yl4 a2;
                                        g0 b;
                                        int i5 = r2;
                                        z5f z5fVar = this.b;
                                        switch (i5) {
                                            case 0:
                                                z5fVar.b();
                                                return;
                                            case 1:
                                                a0f a0fVar3 = z5fVar.b;
                                                String str = z5fVar.c;
                                                ydf ydfVar = r6f.a;
                                                abf abfVar2 = abf.O;
                                                Context context = a0fVar3.b;
                                                Pattern pattern = p9f.a;
                                                yv yvVar = new yv(context);
                                                yvVar.O("phenotype");
                                                yvVar.R("all_accounts.pb");
                                                Uri S = yvVar.S();
                                                if (S != null) {
                                                    o3f u = o3f.u();
                                                    if (u != null) {
                                                        ydf ydfVar2 = r6f.a;
                                                        ydfVar2.getClass();
                                                        d59 d59Var = new d59(ydfVar2);
                                                        ms5 ms5Var = qs5.b;
                                                        mm9 mm9Var = mm9.e;
                                                        obf obfVar2 = new obf(S, u, d59Var, mm9Var);
                                                        w2e w2eVar = r6f.c;
                                                        if (w2eVar == null) {
                                                            synchronized (r6f.b) {
                                                                try {
                                                                    w2eVar = r6f.c;
                                                                    if (w2eVar == null) {
                                                                        HashMap hashMap = new HashMap();
                                                                        jcf jcfVar = jcf.a;
                                                                        i3 = 1;
                                                                        a0fVar2 = a0fVar3;
                                                                        wq9.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                        hashMap.put("singleproc", jcfVar);
                                                                        w2e w2eVar2 = new w2e(a0fVar3.a(), (b9f) a0fVar3.f.get(), hashMap);
                                                                        r6f.c = w2eVar2;
                                                                        w2eVar = w2eVar2;
                                                                    } else {
                                                                        a0fVar2 = a0fVar3;
                                                                        i3 = 1;
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                        } else {
                                                            a0fVar2 = a0fVar3;
                                                            i3 = 1;
                                                        }
                                                        String str2 = "";
                                                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w2eVar.b;
                                                        Pair pair = (Pair) concurrentHashMap.get(S);
                                                        if (pair == null) {
                                                            wq9.u(S.isHierarchical(), "Uri must be hierarchical: %s", S);
                                                            String lastPathSegment = S.getLastPathSegment();
                                                            if (lastPathSegment == null) {
                                                                lastPathSegment = "";
                                                            }
                                                            int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                            if (lastIndexOf == -1) {
                                                                substring = "";
                                                            } else {
                                                                substring = lastPathSegment.substring(lastIndexOf + 1);
                                                            }
                                                            wq9.u(substring.equals("pb"), "Uri extension must be .pb: %s", S);
                                                            jcf jcfVar2 = (jcf) ((HashMap) w2eVar.f).get("singleproc");
                                                            if (jcfVar2 != null) {
                                                                z = i3;
                                                            } else {
                                                                z = 0;
                                                            }
                                                            wq9.u(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                            String lastPathSegment2 = S.getLastPathSegment();
                                                            if (lastPathSegment2 != null) {
                                                                str2 = lastPathSegment2;
                                                            }
                                                            int lastIndexOf2 = str2.lastIndexOf(46);
                                                            if (lastIndexOf2 != -1) {
                                                                str2 = str2.substring(0, lastIndexOf2);
                                                            }
                                                            s3 f = dv4.f(dv4.c(S), (s1f) w2eVar.e, e73.a);
                                                            Executor executor = (Executor) w2eVar.c;
                                                            b9f b9fVar = (b9f) w2eVar.d;
                                                            jcfVar2.getClass();
                                                            bef befVar = new bef(u, h0e.a());
                                                            String str3 = str2;
                                                            i4 = i3;
                                                            abfVar = abfVar2;
                                                            o3fVar = u;
                                                            obfVar = obfVar2;
                                                            bcf bcfVar = new bcf(new kn(str3, dv4.c(S), befVar, executor, b9fVar, d59Var, new bl8(29)), f);
                                                            if (!mm9Var.isEmpty()) {
                                                                b7f b7fVar = new b7f(i4, mm9Var, executor);
                                                                synchronized (bcfVar.g) {
                                                                    bcfVar.i.add(b7fVar);
                                                                }
                                                            }
                                                            pair = Pair.create(bcfVar, obfVar);
                                                            Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(S, pair);
                                                            if (pair2 != null) {
                                                                pair = pair2;
                                                            }
                                                        } else {
                                                            o3fVar = u;
                                                            obfVar = obfVar2;
                                                            i4 = i3;
                                                            abfVar = abfVar2;
                                                        }
                                                        bcf bcfVar2 = (bcf) pair.first;
                                                        obf obfVar3 = (obf) pair.second;
                                                        if (obfVar.equals(obfVar3)) {
                                                            t3 a3 = bcfVar2.a(new n5f(str, i4), a0fVar2.a());
                                                            a3.a(new i5f(z5fVar, a3, 0), a0fVar2.a());
                                                            return;
                                                        }
                                                        String v = hma.v("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", o3f.class.getSimpleName(), S);
                                                        wq9.u(S.equals(obfVar3.a), v, "uri");
                                                        wq9.u(o3fVar.equals(obfVar3.b), v, "schema");
                                                        wq9.u(d59Var.equals(obfVar3.c), v, "handler");
                                                        wq9.u(mm9Var.equals(obfVar3.d), v, "migrations");
                                                        Object obj = abfVar;
                                                        wq9.u(obj.equals(obj), v, "variantConfig");
                                                        vs.m(hma.v(v, NetworkResponseData.UNKNOWN_CONTENT_TYPE));
                                                        return;
                                                    }
                                                    xk5.k("Null schema");
                                                    return;
                                                }
                                                xk5.k("Null uri");
                                                return;
                                            case 2:
                                                g7f g7fVar = z5fVar.b.i;
                                                boolean z2 = z5fVar.e;
                                                j5f j5fVar = j5f.a;
                                                l7f l7fVar = (l7f) g7fVar.c.get();
                                                if (l7fVar == null && !z2) {
                                                    fs5 fs5Var = fs5.b;
                                                    return;
                                                }
                                                if ((g7fVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = g7fVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i6 = g7fVar.e;
                                                            if ((i6 & 64) == 0) {
                                                                copyOnWriteArrayList.add(j5fVar);
                                                                g7fVar.e = i6 | 64;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (g7fVar.h == null) {
                                                    synchronized (g7fVar.g) {
                                                        try {
                                                            if (g7fVar.h == null) {
                                                                if (l7fVar == null) {
                                                                    l7fVar = e7f.a;
                                                                }
                                                                Context context2 = g7fVar.a;
                                                                if (!eze.y(context2)) {
                                                                    t51 t51Var = t51.c;
                                                                    c9b c9bVar = g7fVar.b;
                                                                    a2 = dv4.f(eze.x(context2, Executors.callable(t51Var, null), (Executor) c9bVar.get()), new b7f(0, g7fVar, l7fVar), (Executor) c9bVar.get());
                                                                    g7fVar.h = a2;
                                                                } else {
                                                                    a2 = ((v1f) g7fVar.d.get()).a(new rwa(g7fVar, l7fVar));
                                                                    g7fVar.h = a2;
                                                                }
                                                                a2.a(new og(a2, 24), (Executor) g7fVar.b.get());
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                vz0 a4 = z5fVar.a();
                                                String str4 = (String) a4.b;
                                                a0f a0fVar4 = z5fVar.b;
                                                c9b c9bVar2 = a0fVar4.d;
                                                n7f b2 = a0fVar4.g.b();
                                                boolean z3 = b2.i;
                                                if (b2.j) {
                                                    if (ch0.v(str4) && !z3) {
                                                        fs5 fs5Var2 = fs5.b;
                                                        return;
                                                    }
                                                    a1f u2 = h1f.u();
                                                    vf9 vf9Var = (vf9) a4.e;
                                                    int i7 = vf9Var.b;
                                                    d1f t = g1f.t();
                                                    t.b();
                                                    ((g1f) t.b).u(i7);
                                                    int i8 = vf9Var.c;
                                                    t.b();
                                                    ((g1f) t.b).v(i8);
                                                    u2.b();
                                                    ((h1f) u2.b).w((g1f) t.d());
                                                    if (!ch0.v(str4)) {
                                                        u2.b();
                                                        ((h1f) u2.b).v(str4);
                                                    }
                                                    if (z3) {
                                                        String str5 = z5fVar.c;
                                                        u2.b();
                                                        ((h1f) u2.b).x(str5);
                                                    }
                                                    h1f h1fVar = (h1f) u2.d();
                                                    iye iyeVar = ((v1f) c9bVar2.get()).a;
                                                    uu5 b3 = uu5.b();
                                                    b3.c = new bp9(h1fVar, 20);
                                                    b3.d = new mb4[]{sxd.j};
                                                    b3.a = false;
                                                    b = v1f.b(iyeVar.b(0, b3.a()).continueWithTask(e73.a, new hvc(17, iyeVar, h1fVar)));
                                                } else if (ch0.v(str4)) {
                                                    fs5 fs5Var3 = fs5.b;
                                                    return;
                                                } else {
                                                    v1f v1fVar = (v1f) c9bVar2.get();
                                                    v1fVar.getClass();
                                                    str4.getClass();
                                                    b = v1f.b(v1fVar.a.c(str4));
                                                }
                                                dv4.a(b, r1f.class, new e5f(z5fVar, 0), a0fVar4.a());
                                                return;
                                        }
                                    }
                                });
                                vz0Var = new vz0(v7f.A(), (vf9) a.e);
                                if (this.e || ((vf9) vz0Var.e).c != 17) {
                                    this.a = vz0Var;
                                }
                            } else {
                                a0fVar.a().execute(new Runnable(this) { // from class: b5f
                                    public final /* synthetic */ z5f b;

                                    {
                                        this.b = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        a0f a0fVar2;
                                        int i3;
                                        o3f o3fVar;
                                        obf obfVar;
                                        int i4;
                                        abf abfVar;
                                        String substring;
                                        boolean z;
                                        yl4 a2;
                                        g0 b;
                                        int i5 = r2;
                                        z5f z5fVar = this.b;
                                        switch (i5) {
                                            case 0:
                                                z5fVar.b();
                                                return;
                                            case 1:
                                                a0f a0fVar3 = z5fVar.b;
                                                String str = z5fVar.c;
                                                ydf ydfVar = r6f.a;
                                                abf abfVar2 = abf.O;
                                                Context context = a0fVar3.b;
                                                Pattern pattern = p9f.a;
                                                yv yvVar = new yv(context);
                                                yvVar.O("phenotype");
                                                yvVar.R("all_accounts.pb");
                                                Uri S = yvVar.S();
                                                if (S != null) {
                                                    o3f u = o3f.u();
                                                    if (u != null) {
                                                        ydf ydfVar2 = r6f.a;
                                                        ydfVar2.getClass();
                                                        d59 d59Var = new d59(ydfVar2);
                                                        ms5 ms5Var = qs5.b;
                                                        mm9 mm9Var = mm9.e;
                                                        obf obfVar2 = new obf(S, u, d59Var, mm9Var);
                                                        w2e w2eVar = r6f.c;
                                                        if (w2eVar == null) {
                                                            synchronized (r6f.b) {
                                                                try {
                                                                    w2eVar = r6f.c;
                                                                    if (w2eVar == null) {
                                                                        HashMap hashMap = new HashMap();
                                                                        jcf jcfVar = jcf.a;
                                                                        i3 = 1;
                                                                        a0fVar2 = a0fVar3;
                                                                        wq9.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                        hashMap.put("singleproc", jcfVar);
                                                                        w2e w2eVar2 = new w2e(a0fVar3.a(), (b9f) a0fVar3.f.get(), hashMap);
                                                                        r6f.c = w2eVar2;
                                                                        w2eVar = w2eVar2;
                                                                    } else {
                                                                        a0fVar2 = a0fVar3;
                                                                        i3 = 1;
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                        } else {
                                                            a0fVar2 = a0fVar3;
                                                            i3 = 1;
                                                        }
                                                        String str2 = "";
                                                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w2eVar.b;
                                                        Pair pair = (Pair) concurrentHashMap.get(S);
                                                        if (pair == null) {
                                                            wq9.u(S.isHierarchical(), "Uri must be hierarchical: %s", S);
                                                            String lastPathSegment = S.getLastPathSegment();
                                                            if (lastPathSegment == null) {
                                                                lastPathSegment = "";
                                                            }
                                                            int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                            if (lastIndexOf == -1) {
                                                                substring = "";
                                                            } else {
                                                                substring = lastPathSegment.substring(lastIndexOf + 1);
                                                            }
                                                            wq9.u(substring.equals("pb"), "Uri extension must be .pb: %s", S);
                                                            jcf jcfVar2 = (jcf) ((HashMap) w2eVar.f).get("singleproc");
                                                            if (jcfVar2 != null) {
                                                                z = i3;
                                                            } else {
                                                                z = 0;
                                                            }
                                                            wq9.u(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                            String lastPathSegment2 = S.getLastPathSegment();
                                                            if (lastPathSegment2 != null) {
                                                                str2 = lastPathSegment2;
                                                            }
                                                            int lastIndexOf2 = str2.lastIndexOf(46);
                                                            if (lastIndexOf2 != -1) {
                                                                str2 = str2.substring(0, lastIndexOf2);
                                                            }
                                                            s3 f = dv4.f(dv4.c(S), (s1f) w2eVar.e, e73.a);
                                                            Executor executor = (Executor) w2eVar.c;
                                                            b9f b9fVar = (b9f) w2eVar.d;
                                                            jcfVar2.getClass();
                                                            bef befVar = new bef(u, h0e.a());
                                                            String str3 = str2;
                                                            i4 = i3;
                                                            abfVar = abfVar2;
                                                            o3fVar = u;
                                                            obfVar = obfVar2;
                                                            bcf bcfVar = new bcf(new kn(str3, dv4.c(S), befVar, executor, b9fVar, d59Var, new bl8(29)), f);
                                                            if (!mm9Var.isEmpty()) {
                                                                b7f b7fVar = new b7f(i4, mm9Var, executor);
                                                                synchronized (bcfVar.g) {
                                                                    bcfVar.i.add(b7fVar);
                                                                }
                                                            }
                                                            pair = Pair.create(bcfVar, obfVar);
                                                            Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(S, pair);
                                                            if (pair2 != null) {
                                                                pair = pair2;
                                                            }
                                                        } else {
                                                            o3fVar = u;
                                                            obfVar = obfVar2;
                                                            i4 = i3;
                                                            abfVar = abfVar2;
                                                        }
                                                        bcf bcfVar2 = (bcf) pair.first;
                                                        obf obfVar3 = (obf) pair.second;
                                                        if (obfVar.equals(obfVar3)) {
                                                            t3 a3 = bcfVar2.a(new n5f(str, i4), a0fVar2.a());
                                                            a3.a(new i5f(z5fVar, a3, 0), a0fVar2.a());
                                                            return;
                                                        }
                                                        String v = hma.v("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", o3f.class.getSimpleName(), S);
                                                        wq9.u(S.equals(obfVar3.a), v, "uri");
                                                        wq9.u(o3fVar.equals(obfVar3.b), v, "schema");
                                                        wq9.u(d59Var.equals(obfVar3.c), v, "handler");
                                                        wq9.u(mm9Var.equals(obfVar3.d), v, "migrations");
                                                        Object obj = abfVar;
                                                        wq9.u(obj.equals(obj), v, "variantConfig");
                                                        vs.m(hma.v(v, NetworkResponseData.UNKNOWN_CONTENT_TYPE));
                                                        return;
                                                    }
                                                    xk5.k("Null schema");
                                                    return;
                                                }
                                                xk5.k("Null uri");
                                                return;
                                            case 2:
                                                g7f g7fVar = z5fVar.b.i;
                                                boolean z2 = z5fVar.e;
                                                j5f j5fVar = j5f.a;
                                                l7f l7fVar = (l7f) g7fVar.c.get();
                                                if (l7fVar == null && !z2) {
                                                    fs5 fs5Var = fs5.b;
                                                    return;
                                                }
                                                if ((g7fVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = g7fVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i6 = g7fVar.e;
                                                            if ((i6 & 64) == 0) {
                                                                copyOnWriteArrayList.add(j5fVar);
                                                                g7fVar.e = i6 | 64;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (g7fVar.h == null) {
                                                    synchronized (g7fVar.g) {
                                                        try {
                                                            if (g7fVar.h == null) {
                                                                if (l7fVar == null) {
                                                                    l7fVar = e7f.a;
                                                                }
                                                                Context context2 = g7fVar.a;
                                                                if (!eze.y(context2)) {
                                                                    t51 t51Var = t51.c;
                                                                    c9b c9bVar = g7fVar.b;
                                                                    a2 = dv4.f(eze.x(context2, Executors.callable(t51Var, null), (Executor) c9bVar.get()), new b7f(0, g7fVar, l7fVar), (Executor) c9bVar.get());
                                                                    g7fVar.h = a2;
                                                                } else {
                                                                    a2 = ((v1f) g7fVar.d.get()).a(new rwa(g7fVar, l7fVar));
                                                                    g7fVar.h = a2;
                                                                }
                                                                a2.a(new og(a2, 24), (Executor) g7fVar.b.get());
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                vz0 a4 = z5fVar.a();
                                                String str4 = (String) a4.b;
                                                a0f a0fVar4 = z5fVar.b;
                                                c9b c9bVar2 = a0fVar4.d;
                                                n7f b2 = a0fVar4.g.b();
                                                boolean z3 = b2.i;
                                                if (b2.j) {
                                                    if (ch0.v(str4) && !z3) {
                                                        fs5 fs5Var2 = fs5.b;
                                                        return;
                                                    }
                                                    a1f u2 = h1f.u();
                                                    vf9 vf9Var = (vf9) a4.e;
                                                    int i7 = vf9Var.b;
                                                    d1f t = g1f.t();
                                                    t.b();
                                                    ((g1f) t.b).u(i7);
                                                    int i8 = vf9Var.c;
                                                    t.b();
                                                    ((g1f) t.b).v(i8);
                                                    u2.b();
                                                    ((h1f) u2.b).w((g1f) t.d());
                                                    if (!ch0.v(str4)) {
                                                        u2.b();
                                                        ((h1f) u2.b).v(str4);
                                                    }
                                                    if (z3) {
                                                        String str5 = z5fVar.c;
                                                        u2.b();
                                                        ((h1f) u2.b).x(str5);
                                                    }
                                                    h1f h1fVar = (h1f) u2.d();
                                                    iye iyeVar = ((v1f) c9bVar2.get()).a;
                                                    uu5 b3 = uu5.b();
                                                    b3.c = new bp9(h1fVar, 20);
                                                    b3.d = new mb4[]{sxd.j};
                                                    b3.a = false;
                                                    b = v1f.b(iyeVar.b(0, b3.a()).continueWithTask(e73.a, new hvc(17, iyeVar, h1fVar)));
                                                } else if (ch0.v(str4)) {
                                                    fs5 fs5Var3 = fs5.b;
                                                    return;
                                                } else {
                                                    v1f v1fVar = (v1f) c9bVar2.get();
                                                    v1fVar.getClass();
                                                    str4.getClass();
                                                    b = v1f.b(v1fVar.a.c(str4));
                                                }
                                                dv4.a(b, r1f.class, new e5f(z5fVar, 0), a0fVar4.a());
                                                return;
                                        }
                                    }
                                });
                                a0fVar.a.i((szd) a.c, this.f, this.c);
                                if (!this.d.equals("")) {
                                    a0fVar.a().execute(new Runnable(this) { // from class: b5f
                                        public final /* synthetic */ z5f b;

                                        {
                                            this.b = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            a0f a0fVar2;
                                            int i3;
                                            o3f o3fVar;
                                            obf obfVar;
                                            int i4;
                                            abf abfVar;
                                            String substring;
                                            boolean z;
                                            yl4 a2;
                                            g0 b;
                                            int i5 = r2;
                                            z5f z5fVar = this.b;
                                            switch (i5) {
                                                case 0:
                                                    z5fVar.b();
                                                    return;
                                                case 1:
                                                    a0f a0fVar3 = z5fVar.b;
                                                    String str = z5fVar.c;
                                                    ydf ydfVar = r6f.a;
                                                    abf abfVar2 = abf.O;
                                                    Context context = a0fVar3.b;
                                                    Pattern pattern = p9f.a;
                                                    yv yvVar = new yv(context);
                                                    yvVar.O("phenotype");
                                                    yvVar.R("all_accounts.pb");
                                                    Uri S = yvVar.S();
                                                    if (S != null) {
                                                        o3f u = o3f.u();
                                                        if (u != null) {
                                                            ydf ydfVar2 = r6f.a;
                                                            ydfVar2.getClass();
                                                            d59 d59Var = new d59(ydfVar2);
                                                            ms5 ms5Var = qs5.b;
                                                            mm9 mm9Var = mm9.e;
                                                            obf obfVar2 = new obf(S, u, d59Var, mm9Var);
                                                            w2e w2eVar = r6f.c;
                                                            if (w2eVar == null) {
                                                                synchronized (r6f.b) {
                                                                    try {
                                                                        w2eVar = r6f.c;
                                                                        if (w2eVar == null) {
                                                                            HashMap hashMap = new HashMap();
                                                                            jcf jcfVar = jcf.a;
                                                                            i3 = 1;
                                                                            a0fVar2 = a0fVar3;
                                                                            wq9.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                            hashMap.put("singleproc", jcfVar);
                                                                            w2e w2eVar2 = new w2e(a0fVar3.a(), (b9f) a0fVar3.f.get(), hashMap);
                                                                            r6f.c = w2eVar2;
                                                                            w2eVar = w2eVar2;
                                                                        } else {
                                                                            a0fVar2 = a0fVar3;
                                                                            i3 = 1;
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                            } else {
                                                                a0fVar2 = a0fVar3;
                                                                i3 = 1;
                                                            }
                                                            String str2 = "";
                                                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w2eVar.b;
                                                            Pair pair = (Pair) concurrentHashMap.get(S);
                                                            if (pair == null) {
                                                                wq9.u(S.isHierarchical(), "Uri must be hierarchical: %s", S);
                                                                String lastPathSegment = S.getLastPathSegment();
                                                                if (lastPathSegment == null) {
                                                                    lastPathSegment = "";
                                                                }
                                                                int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                                if (lastIndexOf == -1) {
                                                                    substring = "";
                                                                } else {
                                                                    substring = lastPathSegment.substring(lastIndexOf + 1);
                                                                }
                                                                wq9.u(substring.equals("pb"), "Uri extension must be .pb: %s", S);
                                                                jcf jcfVar2 = (jcf) ((HashMap) w2eVar.f).get("singleproc");
                                                                if (jcfVar2 != null) {
                                                                    z = i3;
                                                                } else {
                                                                    z = 0;
                                                                }
                                                                wq9.u(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                                String lastPathSegment2 = S.getLastPathSegment();
                                                                if (lastPathSegment2 != null) {
                                                                    str2 = lastPathSegment2;
                                                                }
                                                                int lastIndexOf2 = str2.lastIndexOf(46);
                                                                if (lastIndexOf2 != -1) {
                                                                    str2 = str2.substring(0, lastIndexOf2);
                                                                }
                                                                s3 f = dv4.f(dv4.c(S), (s1f) w2eVar.e, e73.a);
                                                                Executor executor = (Executor) w2eVar.c;
                                                                b9f b9fVar = (b9f) w2eVar.d;
                                                                jcfVar2.getClass();
                                                                bef befVar = new bef(u, h0e.a());
                                                                String str3 = str2;
                                                                i4 = i3;
                                                                abfVar = abfVar2;
                                                                o3fVar = u;
                                                                obfVar = obfVar2;
                                                                bcf bcfVar = new bcf(new kn(str3, dv4.c(S), befVar, executor, b9fVar, d59Var, new bl8(29)), f);
                                                                if (!mm9Var.isEmpty()) {
                                                                    b7f b7fVar = new b7f(i4, mm9Var, executor);
                                                                    synchronized (bcfVar.g) {
                                                                        bcfVar.i.add(b7fVar);
                                                                    }
                                                                }
                                                                pair = Pair.create(bcfVar, obfVar);
                                                                Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(S, pair);
                                                                if (pair2 != null) {
                                                                    pair = pair2;
                                                                }
                                                            } else {
                                                                o3fVar = u;
                                                                obfVar = obfVar2;
                                                                i4 = i3;
                                                                abfVar = abfVar2;
                                                            }
                                                            bcf bcfVar2 = (bcf) pair.first;
                                                            obf obfVar3 = (obf) pair.second;
                                                            if (obfVar.equals(obfVar3)) {
                                                                t3 a3 = bcfVar2.a(new n5f(str, i4), a0fVar2.a());
                                                                a3.a(new i5f(z5fVar, a3, 0), a0fVar2.a());
                                                                return;
                                                            }
                                                            String v = hma.v("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", o3f.class.getSimpleName(), S);
                                                            wq9.u(S.equals(obfVar3.a), v, "uri");
                                                            wq9.u(o3fVar.equals(obfVar3.b), v, "schema");
                                                            wq9.u(d59Var.equals(obfVar3.c), v, "handler");
                                                            wq9.u(mm9Var.equals(obfVar3.d), v, "migrations");
                                                            Object obj = abfVar;
                                                            wq9.u(obj.equals(obj), v, "variantConfig");
                                                            vs.m(hma.v(v, NetworkResponseData.UNKNOWN_CONTENT_TYPE));
                                                            return;
                                                        }
                                                        xk5.k("Null schema");
                                                        return;
                                                    }
                                                    xk5.k("Null uri");
                                                    return;
                                                case 2:
                                                    g7f g7fVar = z5fVar.b.i;
                                                    boolean z2 = z5fVar.e;
                                                    j5f j5fVar = j5f.a;
                                                    l7f l7fVar = (l7f) g7fVar.c.get();
                                                    if (l7fVar == null && !z2) {
                                                        fs5 fs5Var = fs5.b;
                                                        return;
                                                    }
                                                    if ((g7fVar.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = g7fVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i6 = g7fVar.e;
                                                                if ((i6 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(j5fVar);
                                                                    g7fVar.e = i6 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (g7fVar.h == null) {
                                                        synchronized (g7fVar.g) {
                                                            try {
                                                                if (g7fVar.h == null) {
                                                                    if (l7fVar == null) {
                                                                        l7fVar = e7f.a;
                                                                    }
                                                                    Context context2 = g7fVar.a;
                                                                    if (!eze.y(context2)) {
                                                                        t51 t51Var = t51.c;
                                                                        c9b c9bVar = g7fVar.b;
                                                                        a2 = dv4.f(eze.x(context2, Executors.callable(t51Var, null), (Executor) c9bVar.get()), new b7f(0, g7fVar, l7fVar), (Executor) c9bVar.get());
                                                                        g7fVar.h = a2;
                                                                    } else {
                                                                        a2 = ((v1f) g7fVar.d.get()).a(new rwa(g7fVar, l7fVar));
                                                                        g7fVar.h = a2;
                                                                    }
                                                                    a2.a(new og(a2, 24), (Executor) g7fVar.b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vz0 a4 = z5fVar.a();
                                                    String str4 = (String) a4.b;
                                                    a0f a0fVar4 = z5fVar.b;
                                                    c9b c9bVar2 = a0fVar4.d;
                                                    n7f b2 = a0fVar4.g.b();
                                                    boolean z3 = b2.i;
                                                    if (b2.j) {
                                                        if (ch0.v(str4) && !z3) {
                                                            fs5 fs5Var2 = fs5.b;
                                                            return;
                                                        }
                                                        a1f u2 = h1f.u();
                                                        vf9 vf9Var = (vf9) a4.e;
                                                        int i7 = vf9Var.b;
                                                        d1f t = g1f.t();
                                                        t.b();
                                                        ((g1f) t.b).u(i7);
                                                        int i8 = vf9Var.c;
                                                        t.b();
                                                        ((g1f) t.b).v(i8);
                                                        u2.b();
                                                        ((h1f) u2.b).w((g1f) t.d());
                                                        if (!ch0.v(str4)) {
                                                            u2.b();
                                                            ((h1f) u2.b).v(str4);
                                                        }
                                                        if (z3) {
                                                            String str5 = z5fVar.c;
                                                            u2.b();
                                                            ((h1f) u2.b).x(str5);
                                                        }
                                                        h1f h1fVar = (h1f) u2.d();
                                                        iye iyeVar = ((v1f) c9bVar2.get()).a;
                                                        uu5 b3 = uu5.b();
                                                        b3.c = new bp9(h1fVar, 20);
                                                        b3.d = new mb4[]{sxd.j};
                                                        b3.a = false;
                                                        b = v1f.b(iyeVar.b(0, b3.a()).continueWithTask(e73.a, new hvc(17, iyeVar, h1fVar)));
                                                    } else if (ch0.v(str4)) {
                                                        fs5 fs5Var3 = fs5.b;
                                                        return;
                                                    } else {
                                                        v1f v1fVar = (v1f) c9bVar2.get();
                                                        v1fVar.getClass();
                                                        str4.getClass();
                                                        b = v1f.b(v1fVar.a.c(str4));
                                                    }
                                                    dv4.a(b, r1f.class, new e5f(z5fVar, 0), a0fVar4.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.h.b()) {
                                    a0fVar.a().execute(new Runnable(this) { // from class: b5f
                                        public final /* synthetic */ z5f b;

                                        {
                                            this.b = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            a0f a0fVar2;
                                            int i3;
                                            o3f o3fVar;
                                            obf obfVar;
                                            int i4;
                                            abf abfVar;
                                            String substring;
                                            boolean z;
                                            yl4 a2;
                                            g0 b;
                                            int i5 = r2;
                                            z5f z5fVar = this.b;
                                            switch (i5) {
                                                case 0:
                                                    z5fVar.b();
                                                    return;
                                                case 1:
                                                    a0f a0fVar3 = z5fVar.b;
                                                    String str = z5fVar.c;
                                                    ydf ydfVar = r6f.a;
                                                    abf abfVar2 = abf.O;
                                                    Context context = a0fVar3.b;
                                                    Pattern pattern = p9f.a;
                                                    yv yvVar = new yv(context);
                                                    yvVar.O("phenotype");
                                                    yvVar.R("all_accounts.pb");
                                                    Uri S = yvVar.S();
                                                    if (S != null) {
                                                        o3f u = o3f.u();
                                                        if (u != null) {
                                                            ydf ydfVar2 = r6f.a;
                                                            ydfVar2.getClass();
                                                            d59 d59Var = new d59(ydfVar2);
                                                            ms5 ms5Var = qs5.b;
                                                            mm9 mm9Var = mm9.e;
                                                            obf obfVar2 = new obf(S, u, d59Var, mm9Var);
                                                            w2e w2eVar = r6f.c;
                                                            if (w2eVar == null) {
                                                                synchronized (r6f.b) {
                                                                    try {
                                                                        w2eVar = r6f.c;
                                                                        if (w2eVar == null) {
                                                                            HashMap hashMap = new HashMap();
                                                                            jcf jcfVar = jcf.a;
                                                                            i3 = 1;
                                                                            a0fVar2 = a0fVar3;
                                                                            wq9.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                            hashMap.put("singleproc", jcfVar);
                                                                            w2e w2eVar2 = new w2e(a0fVar3.a(), (b9f) a0fVar3.f.get(), hashMap);
                                                                            r6f.c = w2eVar2;
                                                                            w2eVar = w2eVar2;
                                                                        } else {
                                                                            a0fVar2 = a0fVar3;
                                                                            i3 = 1;
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                            } else {
                                                                a0fVar2 = a0fVar3;
                                                                i3 = 1;
                                                            }
                                                            String str2 = "";
                                                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w2eVar.b;
                                                            Pair pair = (Pair) concurrentHashMap.get(S);
                                                            if (pair == null) {
                                                                wq9.u(S.isHierarchical(), "Uri must be hierarchical: %s", S);
                                                                String lastPathSegment = S.getLastPathSegment();
                                                                if (lastPathSegment == null) {
                                                                    lastPathSegment = "";
                                                                }
                                                                int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                                if (lastIndexOf == -1) {
                                                                    substring = "";
                                                                } else {
                                                                    substring = lastPathSegment.substring(lastIndexOf + 1);
                                                                }
                                                                wq9.u(substring.equals("pb"), "Uri extension must be .pb: %s", S);
                                                                jcf jcfVar2 = (jcf) ((HashMap) w2eVar.f).get("singleproc");
                                                                if (jcfVar2 != null) {
                                                                    z = i3;
                                                                } else {
                                                                    z = 0;
                                                                }
                                                                wq9.u(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                                String lastPathSegment2 = S.getLastPathSegment();
                                                                if (lastPathSegment2 != null) {
                                                                    str2 = lastPathSegment2;
                                                                }
                                                                int lastIndexOf2 = str2.lastIndexOf(46);
                                                                if (lastIndexOf2 != -1) {
                                                                    str2 = str2.substring(0, lastIndexOf2);
                                                                }
                                                                s3 f = dv4.f(dv4.c(S), (s1f) w2eVar.e, e73.a);
                                                                Executor executor = (Executor) w2eVar.c;
                                                                b9f b9fVar = (b9f) w2eVar.d;
                                                                jcfVar2.getClass();
                                                                bef befVar = new bef(u, h0e.a());
                                                                String str3 = str2;
                                                                i4 = i3;
                                                                abfVar = abfVar2;
                                                                o3fVar = u;
                                                                obfVar = obfVar2;
                                                                bcf bcfVar = new bcf(new kn(str3, dv4.c(S), befVar, executor, b9fVar, d59Var, new bl8(29)), f);
                                                                if (!mm9Var.isEmpty()) {
                                                                    b7f b7fVar = new b7f(i4, mm9Var, executor);
                                                                    synchronized (bcfVar.g) {
                                                                        bcfVar.i.add(b7fVar);
                                                                    }
                                                                }
                                                                pair = Pair.create(bcfVar, obfVar);
                                                                Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(S, pair);
                                                                if (pair2 != null) {
                                                                    pair = pair2;
                                                                }
                                                            } else {
                                                                o3fVar = u;
                                                                obfVar = obfVar2;
                                                                i4 = i3;
                                                                abfVar = abfVar2;
                                                            }
                                                            bcf bcfVar2 = (bcf) pair.first;
                                                            obf obfVar3 = (obf) pair.second;
                                                            if (obfVar.equals(obfVar3)) {
                                                                t3 a3 = bcfVar2.a(new n5f(str, i4), a0fVar2.a());
                                                                a3.a(new i5f(z5fVar, a3, 0), a0fVar2.a());
                                                                return;
                                                            }
                                                            String v = hma.v("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", o3f.class.getSimpleName(), S);
                                                            wq9.u(S.equals(obfVar3.a), v, "uri");
                                                            wq9.u(o3fVar.equals(obfVar3.b), v, "schema");
                                                            wq9.u(d59Var.equals(obfVar3.c), v, "handler");
                                                            wq9.u(mm9Var.equals(obfVar3.d), v, "migrations");
                                                            Object obj = abfVar;
                                                            wq9.u(obj.equals(obj), v, "variantConfig");
                                                            vs.m(hma.v(v, NetworkResponseData.UNKNOWN_CONTENT_TYPE));
                                                            return;
                                                        }
                                                        xk5.k("Null schema");
                                                        return;
                                                    }
                                                    xk5.k("Null uri");
                                                    return;
                                                case 2:
                                                    g7f g7fVar = z5fVar.b.i;
                                                    boolean z2 = z5fVar.e;
                                                    j5f j5fVar = j5f.a;
                                                    l7f l7fVar = (l7f) g7fVar.c.get();
                                                    if (l7fVar == null && !z2) {
                                                        fs5 fs5Var = fs5.b;
                                                        return;
                                                    }
                                                    if ((g7fVar.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = g7fVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i6 = g7fVar.e;
                                                                if ((i6 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(j5fVar);
                                                                    g7fVar.e = i6 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (g7fVar.h == null) {
                                                        synchronized (g7fVar.g) {
                                                            try {
                                                                if (g7fVar.h == null) {
                                                                    if (l7fVar == null) {
                                                                        l7fVar = e7f.a;
                                                                    }
                                                                    Context context2 = g7fVar.a;
                                                                    if (!eze.y(context2)) {
                                                                        t51 t51Var = t51.c;
                                                                        c9b c9bVar = g7fVar.b;
                                                                        a2 = dv4.f(eze.x(context2, Executors.callable(t51Var, null), (Executor) c9bVar.get()), new b7f(0, g7fVar, l7fVar), (Executor) c9bVar.get());
                                                                        g7fVar.h = a2;
                                                                    } else {
                                                                        a2 = ((v1f) g7fVar.d.get()).a(new rwa(g7fVar, l7fVar));
                                                                        g7fVar.h = a2;
                                                                    }
                                                                    a2.a(new og(a2, 24), (Executor) g7fVar.b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vz0 a4 = z5fVar.a();
                                                    String str4 = (String) a4.b;
                                                    a0f a0fVar4 = z5fVar.b;
                                                    c9b c9bVar2 = a0fVar4.d;
                                                    n7f b2 = a0fVar4.g.b();
                                                    boolean z3 = b2.i;
                                                    if (b2.j) {
                                                        if (ch0.v(str4) && !z3) {
                                                            fs5 fs5Var2 = fs5.b;
                                                            return;
                                                        }
                                                        a1f u2 = h1f.u();
                                                        vf9 vf9Var = (vf9) a4.e;
                                                        int i7 = vf9Var.b;
                                                        d1f t = g1f.t();
                                                        t.b();
                                                        ((g1f) t.b).u(i7);
                                                        int i8 = vf9Var.c;
                                                        t.b();
                                                        ((g1f) t.b).v(i8);
                                                        u2.b();
                                                        ((h1f) u2.b).w((g1f) t.d());
                                                        if (!ch0.v(str4)) {
                                                            u2.b();
                                                            ((h1f) u2.b).v(str4);
                                                        }
                                                        if (z3) {
                                                            String str5 = z5fVar.c;
                                                            u2.b();
                                                            ((h1f) u2.b).x(str5);
                                                        }
                                                        h1f h1fVar = (h1f) u2.d();
                                                        iye iyeVar = ((v1f) c9bVar2.get()).a;
                                                        uu5 b3 = uu5.b();
                                                        b3.c = new bp9(h1fVar, 20);
                                                        b3.d = new mb4[]{sxd.j};
                                                        b3.a = false;
                                                        b = v1f.b(iyeVar.b(0, b3.a()).continueWithTask(e73.a, new hvc(17, iyeVar, h1fVar)));
                                                    } else if (ch0.v(str4)) {
                                                        fs5 fs5Var3 = fs5.b;
                                                        return;
                                                    } else {
                                                        v1f v1fVar = (v1f) c9bVar2.get();
                                                        v1fVar.getClass();
                                                        str4.getClass();
                                                        b = v1f.b(v1fVar.a.c(str4));
                                                    }
                                                    dv4.a(b, r1f.class, new e5f(z5fVar, 0), a0fVar4.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        vz0Var = a;
                        if (this.e) {
                        }
                        this.a = vz0Var;
                    }
                } finally {
                }
            }
            return vz0Var;
        }
        return vz0Var2;
    }

    public final void b() {
        q7f q7fVar = this.h;
        a0f a0fVar = q7fVar.a;
        v1f v1fVar = (v1f) a0fVar.d.get();
        String str = q7fVar.c;
        v1fVar.getClass();
        str.getClass();
        iye iyeVar = v1fVar.a;
        uu5 b = uu5.b();
        b.c = new zhe(str, 6);
        t3 e = dv4.e(v1f.b(iyeVar.b(0, b.a()).continueWith(e73.a, new iv8(27))), k3e.d, a0fVar.a());
        e5f e5fVar = new e5f(q7fVar, 1);
        a0f a0fVar2 = this.b;
        dv4.f(e, e5fVar, a0fVar2.a()).a(new i5f(this, e, 1), a0fVar2.a());
    }
}
