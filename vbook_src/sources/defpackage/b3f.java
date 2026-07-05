package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b3f  reason: default package */
/* loaded from: classes.dex */
public final class b3f extends f5f {
    public final jya C;
    public final jya D;
    public final jya E;
    public final jya F;
    public final HashMap d;
    public final jya e;
    public final jya f;

    public b3f(a6f a6fVar) {
        super(a6fVar);
        this.d = new HashMap();
        dre dreVar = ((lte) this.a).e;
        lte.k(dreVar);
        this.e = new jya(dreVar, "last_delete_stale", 0L);
        dre dreVar2 = ((lte) this.a).e;
        lte.k(dreVar2);
        this.f = new jya(dreVar2, "last_delete_stale_batch", 0L);
        dre dreVar3 = ((lte) this.a).e;
        lte.k(dreVar3);
        this.C = new jya(dreVar3, "backoff", 0L);
        dre dreVar4 = ((lte) this.a).e;
        lte.k(dreVar4);
        this.D = new jya(dreVar4, "last_upload", 0L);
        dre dreVar5 = ((lte) this.a).e;
        lte.k(dreVar5);
        this.E = new jya(dreVar5, "last_upload_attempt", 0L);
        dre dreVar6 = ((lte) this.a).e;
        lte.k(dreVar6);
        this.F = new jya(dreVar6, "midnight_offset", 0L);
    }

    public final Pair b0(d8f d8fVar, hwe hweVar) {
        String str = d8fVar.a;
        am8.p(str);
        if (hweVar.i(dwe.AD_STORAGE) && d8fVar.J) {
            return c0(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    public final Pair c0(String str) {
        y2f y2fVar;
        s8 s8Var;
        W();
        lte lteVar = (lte) this.a;
        kh5 kh5Var = lteVar.G;
        t7e t7eVar = lteVar.d;
        kh5Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.d;
        y2f y2fVar2 = (y2f) hashMap.get(str);
        if (y2fVar2 != null && elapsedRealtime < y2fVar2.c) {
            return new Pair(y2fVar2.a, Boolean.valueOf(y2fVar2.b));
        }
        long f0 = t7eVar.f0(str, yme.b) + elapsedRealtime;
        try {
            try {
                s8Var = t8.a(lteVar.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (y2fVar2 != null && elapsedRealtime < y2fVar2.c + t7eVar.f0(str, yme.c)) {
                    return new Pair(y2fVar2.a, Boolean.valueOf(y2fVar2.b));
                }
                s8Var = null;
            }
        } catch (Exception e) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.I.f(e, "Unable to get advertising id");
            y2fVar = new y2f("", f0, false);
        }
        if (s8Var == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = s8Var.c;
        if (str2 != null) {
            y2fVar = new y2f(str2, f0, s8Var.b);
        } else {
            y2fVar = new y2f("", f0, s8Var.b);
        }
        hashMap.put(str, y2fVar);
        return new Pair(y2fVar.a, Boolean.valueOf(y2fVar.b));
    }

    public final String d0(d8f d8fVar, hwe hweVar) {
        String str = d8fVar.a;
        am8.p(str);
        if (hweVar.i(dwe.AD_STORAGE) && d8fVar.J) {
            W();
            String str2 = (String) c0(str).first;
            MessageDigest q0 = l6f.q0();
            if (q0 == null) {
                return null;
            }
            return String.format(Locale.US, "%032X", new BigInteger(1, q0.digest(str2.getBytes())));
        }
        return "";
    }

    @Override // defpackage.f5f
    public final void a0() {
    }
}
