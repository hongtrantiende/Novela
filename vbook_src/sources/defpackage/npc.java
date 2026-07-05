package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: npc  reason: default package */
/* loaded from: classes3.dex */
public final class npc {
    public final cza a = dza.a(new kpc());
    public final cza b = dza.a(new lpc());
    public final cza c = dza.a(new mpc(0));
    public final cza d = dza.a(1);

    public final void a(String str) {
        str.getClass();
        while (true) {
            cza czaVar = this.a;
            Object value = czaVar.getValue();
            String str2 = str;
            if (czaVar.l(value, kpc.a((kpc) value, str2, 0, null, false, false, false, false, Token.ELSE))) {
                return;
            }
            str = str2;
        }
    }

    public final void b(int i, String str) {
        str.getClass();
        while (true) {
            cza czaVar = this.a;
            Object value = czaVar.getValue();
            int i2 = i;
            String str2 = str;
            if (czaVar.l(value, kpc.a((kpc) value, null, i2, str2, false, true, false, false, 9))) {
                return;
            }
            i = i2;
            str = str2;
        }
    }

    public final void c() {
        cza czaVar;
        Object value;
        do {
            czaVar = this.a;
            value = czaVar.getValue();
        } while (!czaVar.l(value, kpc.a((kpc) value, null, 0, null, false, false, false, true, 15)));
    }

    public final void d(boolean z, boolean z2) {
        while (true) {
            cza czaVar = this.a;
            Object value = czaVar.getValue();
            boolean z3 = z;
            boolean z4 = z2;
            if (czaVar.l(value, kpc.a((kpc) value, null, 0, null, false, z3, z4, false, 15))) {
                return;
            }
            z = z3;
            z2 = z4;
        }
    }
}
