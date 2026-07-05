package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jya  reason: default package */
/* loaded from: classes.dex */
public final class jya implements b47 {
    public long a;
    public boolean b;
    public long c;
    public final Object d;
    public Object e;

    public jya(dre dreVar, String str, long j) {
        Objects.requireNonNull(dreVar);
        this.e = dreVar;
        am8.p(str);
        this.d = str;
        this.a = j;
    }

    @Override // defpackage.b47
    public void a(my8 my8Var) {
        if (this.b) {
            d(b());
        }
        this.e = my8Var;
    }

    @Override // defpackage.b47
    public long b() {
        long j;
        long j2 = this.a;
        if (this.b) {
            ((xfb) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
            my8 my8Var = (my8) this.e;
            if (my8Var.a == 1.0f) {
                j = a2d.Q(elapsedRealtime);
            } else {
                j = elapsedRealtime * my8Var.c;
            }
            return j + j2;
        }
        return j2;
    }

    public void d(long j) {
        this.a = j;
        if (this.b) {
            ((xfb) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.b47
    public my8 e() {
        return (my8) this.e;
    }

    public void f() {
        if (!this.b) {
            ((xfb) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
            this.b = true;
        }
    }

    public long g() {
        if (!this.b) {
            this.b = true;
            long j = this.a;
            this.c = ((dre) this.e).b0().getLong((String) this.d, j);
        }
        return this.c;
    }

    public void h(long j) {
        SharedPreferences.Editor edit = ((dre) this.e).b0().edit();
        edit.putLong((String) this.d, j);
        edit.apply();
        this.c = j;
    }

    public jya(xfb xfbVar) {
        this.d = xfbVar;
        this.e = my8.d;
    }
}
