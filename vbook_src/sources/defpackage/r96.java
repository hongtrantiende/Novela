package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r96  reason: default package */
/* loaded from: classes3.dex */
public final class r96 {
    public static final r96 a;
    public static final /* synthetic */ r96[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r96] */
    static {
        ?? r0 = new Enum("VIEWMODEL_SCOPE_FACTORY", 0);
        a = r0;
        b = new r96[]{r0};
    }

    public static r96 valueOf(String str) {
        return (r96) Enum.valueOf(r96.class, str);
    }

    public static r96[] values() {
        return (r96[]) b.clone();
    }
}
