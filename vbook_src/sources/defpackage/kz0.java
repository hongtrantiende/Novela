package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kz0  reason: default package */
/* loaded from: classes3.dex */
public final class kz0 {
    public static final kz0 a;
    public static final /* synthetic */ kz0[] b;
    /* JADX INFO: Fake field, exist only in values array */
    kz0 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [kz0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kz0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEBUG", 0);
        ?? r1 = new Enum("RELEASE", 1);
        a = r1;
        b = new kz0[]{r0, r1};
    }

    public static kz0 valueOf(String str) {
        return (kz0) Enum.valueOf(kz0.class, str);
    }

    public static kz0[] values() {
        return (kz0[]) b.clone();
    }
}
