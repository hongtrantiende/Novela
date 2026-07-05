package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o58  reason: default package */
/* loaded from: classes3.dex */
public final class o58 {
    public static final o58 a;
    public static final /* synthetic */ o58[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [o58, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o58, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Local", 0);
        a = r0;
        b = new o58[]{r0, new Enum("Server", 1)};
    }

    public static o58 valueOf(String str) {
        return (o58) Enum.valueOf(o58.class, str);
    }

    public static o58[] values() {
        return (o58[]) b.clone();
    }
}
