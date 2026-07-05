package defpackage;

import com.reader.android.MainActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: th9  reason: default package */
/* loaded from: classes.dex */
public final class th9 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ th9(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                return hma.t(mainActivity).e(cm9.a(zf.class), null, null);
            case 1:
                return hma.t(mainActivity).e(cm9.a(djb.class), null, null);
            case 2:
                return mainActivity.e();
            case 3:
                return mainActivity.i();
            default:
                return mainActivity.f();
        }
    }
}
