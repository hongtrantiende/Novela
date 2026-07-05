package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m55  reason: default package */
/* loaded from: classes.dex */
public final class m55 {
    public static final e49 b = new e49("fire-global");
    public static final e49 c = new e49("fire-count");
    public static final e49 d = new e49("last-used-date");
    public final n26 a;

    public m55(Context context, String str) {
        this.a = new n26(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public static e49 c(pv7 pv7Var, String str) {
        for (Map.Entry entry : pv7Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return s9e.y(((e49) entry.getKey()).a);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void d(pv7 pv7Var, String str) {
        e49 c2 = c(pv7Var, str);
        if (c2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) c16.n(pv7Var, c2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            pv7Var.d(c2);
        } else {
            pv7Var.f(c2, hashSet);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b2 = b(System.currentTimeMillis());
            n26 n26Var = this.a;
            n26Var.getClass();
            for (Map.Entry entry : ((Map) z87.C(gs3.a, new o54(n26Var, (m42) null, 15))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new oc0(((e49) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new th(currentTimeMillis, 11));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(e49 e49Var, long j) {
        n26 n26Var = this.a;
        n26Var.getClass();
        e49Var.getClass();
        c95 c95Var = new c95(n26Var, e49Var, (m42) null, 12);
        gs3 gs3Var = gs3.a;
        if (b(((Long) z87.C(gs3Var, c95Var)).longValue()).equals(b(j))) {
            return false;
        }
        n26 n26Var2 = this.a;
        Long valueOf = Long.valueOf(j);
        n26Var2.getClass();
        pv7 pv7Var = (pv7) z87.C(gs3Var, new qq4(n26Var2, e49Var, valueOf, (m42) null, 12));
        return true;
    }
}
