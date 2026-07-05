package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h9b  reason: default package */
/* loaded from: classes.dex */
public final class h9b implements cw9 {
    public final it4 a;

    public h9b(it4 it4Var) {
        it4Var.getClass();
        this.a = it4Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [q9b, s9b] */
    @Override // defpackage.cw9
    /* renamed from: o */
    public final s9b h1(String str) {
        str.getClass();
        it4 it4Var = this.a;
        it4Var.getClass();
        String obj = k4b.N0(str).toString();
        if (obj.length() >= 3) {
            String upperCase = obj.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                ?? s9bVar = new s9b(it4Var, str);
                s9bVar.d = new int[0];
                s9bVar.e = new long[0];
                s9bVar.f = new double[0];
                s9bVar.C = new String[0];
                s9bVar.D = new byte[0];
                return s9bVar;
            }
        }
        return new r9b(it4Var, str);
    }
}
