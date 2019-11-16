package webec

import grails.gorm.transactions.Transactional

// DK: this is needed or the custom validator takes issue with
// the then-known persistent state when called at BootStrap time.

@Transactional
class SecService {

    SecUserSecRole create(SecUser user, SecRole role) {
        new SecUserSecRole(secUser: user, secRole: role).save(failOnError: true);
    }
}
