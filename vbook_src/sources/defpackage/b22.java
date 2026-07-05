package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b22  reason: default package */
/* loaded from: classes3.dex */
public final class b22 {
    public final p81 a = new p81();
    public final p81 b = new p81();
    public final a22 c = a22.c;

    public final void a(z12 z12Var) {
        z12Var.getClass();
        String name = z12Var.getName();
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(z12Var, lowerCase);
        this.b.remove(name);
    }
}
