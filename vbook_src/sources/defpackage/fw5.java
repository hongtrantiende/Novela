package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fw5  reason: default package */
/* loaded from: classes.dex */
public final class fw5 extends InputConnectionWrapper {
    public final /* synthetic */ v28 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw5(nza nzaVar, v28 v28Var) {
        super(nzaVar, false);
        this.a = v28Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        uwd uwdVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            uwdVar = new uwd(new hw5(inputContentInfo), 22);
        }
        this.a.f(uwdVar, i, bundle);
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
