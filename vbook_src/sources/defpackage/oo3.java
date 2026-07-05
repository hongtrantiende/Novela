package defpackage;

import android.app.PictureInPictureUiState;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oo3  reason: default package */
/* loaded from: classes.dex */
public abstract class oo3 {
    public static final void a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static iv8 b(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new iv8(0);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            return new iv8(0);
        } else {
            return new iv8(0);
        }
    }

    public static hla c(SigningInfo signingInfo) {
        ArrayList arrayList;
        Collection collection;
        int i;
        Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
        List list = ks3.a;
        if (apkContentsSigners != null) {
            arrayList = b00.l0(apkContentsSigners);
        } else {
            arrayList = list;
        }
        int i2 = Build.VERSION.SDK_INT;
        rs3 rs3Var = rs3.a;
        if (i2 < 35 || (collection = signingInfo.getPublicKeys()) == null) {
            collection = rs3Var;
        }
        if (i2 >= 35) {
            i = signingInfo.getSchemeVersion();
        } else {
            i = 0;
        }
        int i3 = i;
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        if (signingCertificateHistory != null) {
            list = b00.l0(signingCertificateHistory);
        }
        return new hla(list, arrayList, collection, i3, signingInfo.hasPastSigningCertificates(), signingInfo.hasMultipleSigners());
    }

    public static void d(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void e(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
