package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zp6  reason: default package */
/* loaded from: classes3.dex */
public final class zp6 {
    public static final zp6 a;
    public static final /* synthetic */ zp6[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [zp6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Blank", 0);
        a = r0;
        b = new zp6[]{r0};
    }

    public static zp6 valueOf(String str) {
        return (zp6) Enum.valueOf(zp6.class, str);
    }

    public static zp6[] values() {
        return (zp6[]) b.clone();
    }
}
