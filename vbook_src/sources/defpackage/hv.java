package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hv  reason: default package */
/* loaded from: classes.dex */
public class hv extends iv {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(String str) {
        super("IMPLEMENTATION_ONLY_FEATURE", str);
        this.d = 3;
    }

    @Override // defpackage.iv
    public final boolean a() {
        switch (this.d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            case 5:
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            case 6:
                if (Build.VERSION.SDK_INT >= 28) {
                    return true;
                }
                return false;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv(String str, String str2, int i) {
        super(str, str2);
        this.d = i;
    }
}
