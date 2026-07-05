package defpackage;

import android.os.Bundle;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: khe  reason: default package */
/* loaded from: classes.dex */
public final class khe extends yje {
    public final /* synthetic */ String C;
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ qke E;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khe(qke qkeVar, String str, String str2, Bundle bundle, int i) {
        super(qkeVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = str;
                this.C = str2;
                this.D = bundle;
                Objects.requireNonNull(qkeVar);
                this.E = qkeVar;
                super(qkeVar, true);
                return;
            default:
                this.f = str;
                this.C = str2;
                this.D = bundle;
                this.E = qkeVar;
                return;
        }
    }

    @Override // defpackage.yje
    public final void a() {
        switch (this.e) {
            case 0:
                yee yeeVar = this.E.f;
                am8.s(yeeVar);
                yeeVar.clearConditionalUserProperty(this.f, this.C, this.D);
                return;
            default:
                long j = this.a;
                long j2 = this.b;
                yee yeeVar2 = this.E.f;
                am8.s(yeeVar2);
                yeeVar2.logEventWithElapsedTime(this.f, this.C, this.D, true, true, j, j2);
                return;
        }
    }
}
