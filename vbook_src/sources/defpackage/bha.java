package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bha  reason: default package */
/* loaded from: classes3.dex */
public final class bha {
    public static final bha a;
    public static final bha b;
    public static final /* synthetic */ bha[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bha] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bha] */
    static {
        ?? r0 = new Enum("GENERAL", 0);
        a = r0;
        ?? r1 = new Enum("FALLBACK", 1);
        b = r1;
        c = new bha[]{r0, r1};
    }

    public static bha valueOf(String str) {
        return (bha) Enum.valueOf(bha.class, str);
    }

    public static bha[] values() {
        return (bha[]) c.clone();
    }
}
