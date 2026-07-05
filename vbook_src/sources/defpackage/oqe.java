package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oqe  reason: default package */
/* loaded from: classes.dex */
public final class oqe {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ dre e;

    public oqe(dre dreVar, String str, boolean z) {
        this.e = dreVar;
        am8.p(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.b0().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.e.b0().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
